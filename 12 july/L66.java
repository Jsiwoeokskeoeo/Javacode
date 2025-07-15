//use of interface in java

interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public static final Laptop Macbook = null;

    public void  code()
    {
        System.out.println("compile and runcode");
    }

    public Laptop getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("compile and run code faster");

    }
}

class Developer 

{
     public void code( Computer obj)   
     {     //yahan object pass hogi jiska reference computer ke interface se hoga
        obj.code();
     }
}



public class L66 
{

    public static void main( String a[])
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer devApp = new Developer();

        devApp.code(desk);            //yahan  jo object pass hogi uske andar ka code run hoga
    
}

}



/*NOTES
  #1
We can also pass an object as a parameter in a method.
When you build an application, you need to make it more flexible.
We can create a reference of the parent class and an object of the sub-class.
Passing reference and the reference of an object that you accept in a method, both should be the same.

#2 
Interface:-
Interface in Java is used to achieve abstraction.
Interface is used to design an application to make it loosely coupled.
implements keyword is used with a class to extend it to an interface
 interface Computer
 {
 }
.........
 class Desktop implements Computer
 { 
  statement;
 }


#3
Need of an Interface:-
It is used to implement abstraction.
We can also achieve multiple inheritance in Java, by using the interface.
Any class can extend only 1 class but can any class implement an infinite number of interface.
It is also used to achieve loose coupling.

 */