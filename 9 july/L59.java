//upcasting and downcasting 
//here there is no dynamic data dispatch so the methods of reference type will be called only.
class A
{
    public void show()
    {
        System.out.println("in A");
    }
}   
class B extends A
    {
        public void show1()
        
        {

        System.out.println("in B");

        }

}    


public class L59 
{
    public static void main( String[] args)
    {
       A obj = new B();
       obj.show();                      //we can use here only methods of class A

       //if u want to use method of B , downcast to B class by 
      
       B obj1 = (B) obj;                 //downcasting
       obj1.show1();                    //it has methods of A as well as B

       //now if u want to upcast do 
        ((A) obj1).show();                 //now again it will have only A s methods, this is upcasting

    }
    
}

