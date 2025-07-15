// Enum     

enum Status                 //Status is a class which is having some inbuilt methods
{
    Running ,Pending , Failed , Success;                   //these are named constants or say objects
//index:0         1        2         3

}
public class L68 
{
    public static void main( String [] args)
    {

        Status s = Status.Failed;   
        System.out.println(s);
        System.out.println(s.ordinal());           //this method returns the ondex of constant


        Status[]  S = Status.values();             //this returns an array
        System.out.println(S[1]);                  // use for specific index

        //using enhanced for loop to print all values
        for(Status ss: S)
        {
            System.out.println(ss +  ":" + ss.ordinal()); 
        }
    }
    
}

//Notes
/*#1
Enum is a short term used for Enumeration.
Enumerations serve the purpose of representing a group of named constants in a programming language.

#2
-Java Enums can be thought of as classes that have a fixed set of constants 
Enum is named constants that we create for specific constants or error codes.
Enum is created in place of an object for constants.
Enum is pre-defined that contains all name constants.
Enums are used to create our data type like classes.
In enum, instead of returning a string format or a specific object, we can simply return a status or a value present inside an enum.
e.g.,  enum Status{
   Running, Failed, Pending, Success;
  }
enum is also treated as a class in Java. Objects can also be created for enum like:
 Status s= Status.Running;
Every enum constant represents an object of type enum.
enum type can be passed as an argument to switch statement

#3
In enum, all the name constants are defined by using numbers.
ordinal() method is used to get the index of the name constant present in the enum.
values() method is used to get all the statuses or name constants of enums.
 Status [][] s= Status.values();
*values() method will give an array. */
