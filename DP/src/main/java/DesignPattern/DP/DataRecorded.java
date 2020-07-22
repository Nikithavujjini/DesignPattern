package DesignPattern.DP;
import java.util.ArrayList;

public class DataRecorded
{
	public ArrayList< ArrayList <ArrayList <Product> > > ecommerceArray;
	public DataRecorded()
	{
		ArrayList<Product> shirtsArray=new ArrayList<Product>();
      
        shirtsArray.add(new Shirts(300,"Tom Hilfiger"));
        shirtsArray.add(new Shirts(500,"Zarman"));
 
        ArrayList< ArrayList<Product> > clothesArray=new ArrayList< ArrayList<Product> >();
        clothesArray.add(shirtsArray);
  
        ArrayList<Product> headphonesArr =new ArrayList<Product>();
        headphonesArr.add(new HeadPhones(10000,"BOAT"));
        headphonesArr .add(new HeadPhones(9000,"OnePlus"));
        
        ArrayList<Product> laptopsArray =new ArrayList<Product>();
        laptopsArray.add(new Laptops(20000,"Dell"));
        laptopsArray.add(new Laptops(30000,"HP"));

        ArrayList<ArrayList<Product>> electronicsArray=new ArrayList<ArrayList<Product>>();
        electronicsArray.add(headphonesArr);
        electronicsArray.add(laptopsArray);
        
        
        ArrayList< ArrayList <ArrayList <Product> > > ecommerceArray=new ArrayList< ArrayList <ArrayList <Product> > >();
        ecommerceArray.add(electronicsArray);
        ecommerceArray.add(clothesArray);
        
        this.ecommerceArray=ecommerceArray;
	}
	public ArrayList< ArrayList <ArrayList <Product> > > getData()
	{
		return this.ecommerceArray;
	}
}