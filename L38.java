class Mobile
{
    String brand; // instance variables
    int price;
    static String name; //a common variable which is used by all objects

    public void show()   //show() is an instance method 
    {
        System.out.println(brand + ":" + name + ":" + price);
    }
    public static void show1(Mobile obj)
    {
        //non static variables ko refrencing deni padti hai of object
        System.out.println(obj.brand + ":" + name + ":" + obj.price);
    }
}
public class L38 
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

        Mobile.show1(obj2);
    }    
}
//why making the main() method as a static method?
/* 
static means the method belongs to the class itself, not to an object.

When you start a Java program (e.g., java MyClass), the JVM needs an entry point to begin execution.

At that point, no objects have been created yet — so the JVM must call a method without needing to instantiate the class.

🔁 What if main() were not static?
If main were not static, you’d need to create an object of your class before calling it:
But here's the catch:
▶ To create the object, you’d need to run some code.
▶ But that code would go… inside main?
▶ It’s a chicken-and-egg problem — you'd need to run main to create the object, but you need the object to run main.
*/