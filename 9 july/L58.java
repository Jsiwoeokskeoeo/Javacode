//toString() , equals() , hashcode()
//case 1: class which not override object class toString(), hashCode(), equals() method
class Mobile{
   String model;
   int price;
}

class L58
{
    public static void main(String []args)
    {
       Mobile mb1=new Mobile();
       mb1.model="Apple";
       mb1.price=100000;

      Mobile mb2=new Mobile();
      mb2.model="Apple";
      mb2.price=100000;

   
System.out.println(mb1); //Internally mb1.toString() is called and print Mobile@4617c264
System.out.println(mb2); // Internally mb2.toString() is called and print Mobile@36baf30c
 
    }
}