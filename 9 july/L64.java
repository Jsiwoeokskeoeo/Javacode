//anonymous class with abstract class

abstract class A
{
    public abstract void show();

}

public class L64 
{
   public static void main( String a[])
   {
    A obj= new A() //this object is of anonymous class

    {     
        public void show()
        {
            System.out.println("in anonymous class");

        }
        //here more abstract methods can be defined here from abstract class
    };
    
    obj.show();
   }
    
}
