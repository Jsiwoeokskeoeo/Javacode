class Mobile
{
    String brand; // instance variables
    int price;
    static String name; //a common variable which is used by all objects

    public void show()   //show() is an instance method 
    {
        System.out.println(brand + ":" + name + ":" + price);
    }
}
public class L37 
{
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand=  "IQOO";
        obj1.price = 50000 ;
        Mobile.name= "PHONE"; //static variable are called by their class name, avoid by calling them by object names
        
        Mobile obj2 = new Mobile();
        obj2.brand=  "APPLE";
        obj2.price = 5000 ;
        Mobile.name= "PHONE";       
        obj1.show();
        obj2.show();
    }
    
}
