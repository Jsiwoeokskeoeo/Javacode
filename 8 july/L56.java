//dynamic method dispatch
class A
{
   public void show()
   {
    System.out.println("in A");
   }
   
   
}

class B extends A
{
    public void show()
    {
     System.out.println("in B");
    }
    
}


public class L56
{

    public static void main(String[] args) 
    {
        /*A obj = new B();       //here type of obj is A but object created is of B 
        obj.show(); */
     
        
        A obj= new A();     //will print in A
        obj.show();

        obj = new B();  //remember now obj refers to object of B and earlier reference is not present anymore
        obj.show(); //will print in B

    }
}