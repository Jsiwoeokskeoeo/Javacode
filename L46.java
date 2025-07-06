//ANONYMOUS OBJECT
class A
{
    public A()
    {
        System.out.println("object is created");

    }

    public void show()
    {
        System.out.println("in a show");
    }
}
public class L46 
{
    public static void main( String a[]){
   /* 
    A obj ;  //this is reference creation
    obj=new A();//this is object creation and assigning the value to obj 
    */
 
    new A();   //anonymous object

    new A().show();

}
}
