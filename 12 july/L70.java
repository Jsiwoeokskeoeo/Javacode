//Enum class in java

enum laptop
{
 
    Macbook(15000), HP, DELL(9000);           //here macbook is an object while the price is a constructor thats not defined


    private int price;

    //if suppose there is no any price given for an object we need a default constructor 
    
        private laptop() 
        {
            //here its ur choice to give a default value
            price=5000;
        }
    
    private laptop(int price)      //remember that the instance variables and constructors are private
    {
        this.price = price;
    }

    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class L70 
{
    public static void main(String[] args) 
    {
        laptop lap= laptop.Macbook;               //if you want to get one , make its object and print
        System.out.println( lap + ":" + lap.getPrice());

        //enhanced for loop
        for(laptop lap1 : laptop.values())
        {
            System.out.println(lap1 + ":" + lap1.getPrice());
        }
    }
    
}

/*
 * #1
We can not extend the enum with any other class.
We can define constructors and methods in an enum. Creation of our constructors and variables is also possible in an enum.
We can also define our data types through enum that are known as Enumerated Data Types.
In Java, enum extends the enum class and we get all other methods present inside an enum through the enum class only.
If we print the superclass of an enum class, then it will also return an enum.
 Status s= Status.Success;
 System.out.println(s.getClass().getSuperclass());
In an enum, every enum constant represents an object of type enum.

#2 
Enum and Constructor:
enum contains a constructor and it is executed separately for each enum constant at the time of enum class loading.
We can create a constructor in an enum that can take any parameter, and that value of a parameter might be different in every object of an enum.
Instance variables in an enum are private and we can access them in another class by using getters and setters.
We can print the value of all objects of an enum through a loop and .values() method is used to iterating over all objects.
If any parameterized constructor is present inside an enum, then the default constructor will not be considered.
We create private variables and private constructors in an enum because we use them or create an object for constructors in the same class only.
The constructor in an enum will be called the number of times as much the number of objects created.

 */