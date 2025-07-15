//more on interface 
   
interface A 
{
   void hello();
   
   
   interface B
   {
    void sing();
    void dance();

}

interface C extends B 
{
      void eat();
   }
   
   class D implements A,C
   {
   
      public void hello()
      {
         System.out.println("hnji");
      }
      public void eat()
      {
         System.out.println("kahle");
      }
      public void sing()
      {
         System.out.println("gaale");
      }
     public  void dance()
      {
         System.out.println("naaach");
      }


   }

public class L67 
   {
      public static void main( String a[])
      {

         A obj = new D();


         obj.hello();                          //only methods from A interface

         //downcaste kia and only methods of B interface
         ((B) obj).dance();
         ((B) obj).sing();
         
         //downcaste kia and only methods of C and B 
         ((C) obj ).eat();
         ((C) obj ).dance();
         
      }
   }
}

/*
#1
We can have a class implementing multiple interfaces.
 class B implemets A,X
 {
 }
(here, A and X are two different interfaces)
Implementation of all the methods that are present in those interfaces should be given in a class.
Inheritance is also valid in between interfaces.
Inheritance can be achieved in between interfaces by using the extend keyword.
Whenever you create a reference of an interface and create an object of a class, then you can only call those methods by that reference that are present in that interface of which the refernce is created.
Methods of another interface can be called by using another reference variable for that interface with the object of a class.

#2
*
class - class - extends
class - interface - implements
interface - interface - extends 
*/