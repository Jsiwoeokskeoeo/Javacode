//static block
class Mobile 
{
    String brand; // instance variables
    int price;
    static String name; // a common variable which is used by all objects

    // static block is called first than constructor
    static {
        System.out.println("this is static block");

    }

    // constructor
    public Mobile() {
        System.out.println("this is constructor");

    }

    public void show() // show() is an instance method
    {
        System.out.println(brand + ":" + name + ":" + price);
    }

    public static void show1(Mobile obj) {
        // non static variables ko refrencing deni padti hai of object
        System.out.println(obj.brand + ":" + name + ":" + obj.price);
    }
}

public class L39 
{
    public static void main(String[] args) 
    {
        // both static and constructor blocks are called as soon the object is
        // instatiated no matter ki attributes pe kuch assign kiya hai ya nahi
        Mobile obj1 = new Mobile();
        /*
        new keyword → allocates memory and calls the constructor.
        Constructor → special method used to initialize the object.
         After instantiation, you can use the object to call methods and access data.
         */
        obj1.brand = "IQOO";
        obj1.price = 50000;
        Mobile.name = "PHONE"; // static variable are called by their class name, avoid by calling them by
                               // object names

        Mobile obj2 = new Mobile();
        obj2.brand = "APPLE";
        obj2.price = 5000;
        Mobile.name = "PHONE";
        obj1.show();
        obj2.show();

        Mobile.show1(obj2);
    }
}