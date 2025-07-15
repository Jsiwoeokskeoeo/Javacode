//Abstract class

abstract class Car
{
    public abstract void drive();

    public void swim()
    {
        System.out.println("swimmmmminggg....");

    }

    public abstract void sing();


}

abstract class BMW extends Car   //as this class cant define all unimplemented methods making it abstract too
{
    public void drive()
    {
        System.out.println("drivinggggg...");
    }
}

class BMW_new   extends BMW   //this is concrete class
{
    public void sing()
    {
        System.out.println("singggggg....");
    }
}
public class L61 
{
    public static void main( String a[])
    {
        Car obj= new BMW_new();
        obj.drive();
        obj.sing();
        obj.swim();

    }
    
}
