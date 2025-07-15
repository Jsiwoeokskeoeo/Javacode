//interface

interface A
{
      
    int x = 10;  //this is a constant, public, static, and final by default
      int y = 20;  //this is also a constant
      
      //abstract methods
      //all methods in an interface are abstract by default
      //they do not have a body and must be implemented by the classes that implement the interface
    void sing();   //these are abstract methods and public by default
      void dance();

}

class B implements A
{
        public void sing()  //overriding the abstract method
        {
                System.out.println("Singing");
        }
    
        public void dance()  //overriding the abstract method
        {
                System.out.println("Dancing");
        }
}

public class L65
{
        public static void main(String[] args)
        {
                A a = new B();  //creating an object of class B using interface A
                a.sing();       //calling the sing method
                a.dance();      //calling the dance method
                System.out.println("Value of x: " + A.x);  //accessing the constant x  from interace A
        
        }


}