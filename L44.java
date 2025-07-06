//default vs parameterized constructor
//different ways to use 

class Human
{

    private int age;
    private String name;

    
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

   
   //dono tareeko mn se koi bhi use karo ,ham default constructor bhi bana sakte source se
   
   
   
   /*  public Human() 
   {
    }
   */


    
   /*  public Human(int age, String name) 
    {
        this.age = age;
        this.name = name;
    }*/
    
    
   // ya toh ese kro constructors define ya source action se 
   public Human()
    {
        age=22;
        name="hello";
    
    }
    
    public Human( int a , String n)
    {
       age=a;
       name=n;
    }
}

public class L44
{
    
    public static void main(String[] args) {
        Human obj= new Human();
        Human obj1= new Human(9,"om");

        System.out.println(obj.getAge());
        System.out.println(obj1.getAge());

    }
}