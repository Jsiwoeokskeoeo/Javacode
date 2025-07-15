//Anonymous Class

class A
{
    public void show()
    {
        System.out.println("in a show");

    }
    
}
public class L63 
{
    public static void main( String a[])
    {
        A obj = new A()
        {
            //this is an inner class termed as anonymous class
            public void show()
            {
                System.out.println("in a show");
            
            }

        };

        obj.show();
    

    }
    
}
