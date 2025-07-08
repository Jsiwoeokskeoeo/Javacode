//FINAL KEYWORD
/*final class A //we now cant use this class for inheritance
{
    public void show()
    {
    System.out.println("hello");

    }
}  */
 class A //we now cant use this class for inheritanc
{
   //no method overriding if same name method present in subclass
    public final void show()
    {
    System.out.println("hello");

    }
}

class B extends A
{
   /*  public  void show()
    {
    System.out.println("hello");
    }*/

    public void hi()
    {}
}





public class L57 {
    public static void main(String[] args) 
    {
        final int marks=15; //now the marks variable cant be overwrite
    }
    
}
