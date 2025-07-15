//inner class

class A
{
    public void show()
    {
        System.out.println("in a show");
    }

    class B 
    {
        public void config()
        {
        System.out.println("in config");
        }
    }
}

public class L62 
{
    public static void main(String[] args) 
    {

        A obj = new A();
        obj.show();  // we can excess methods of A class (not B)

        A.B obj1 = obj.new B();//we need object of A as the B class is not static
        obj1.config();//we can access methods of B class only 

        //do this if inner class is static
        //  A.B obj1= new A.B()
    
    }
    
}
