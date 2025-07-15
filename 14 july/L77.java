//try catch block in exception handling
//- Exception handling is a mechanism in Java that allows developers to handle 
//and recover from errors and exceptional conditions that may occur during the execution of a program. 
//-- One way to handle exceptions in Java is by using the try-catch block.



public class L77 
{
    public static void main(String[] args) 
    {
        int i=0;
        int j=0;

        //this blocks throws exception(object) if there is error
        try
        {
            j=16/i;                                 //this is critical statement 

        }
        catch (Exception e)                         //Exception is class here and e is the object which is thrown by the try block  
        {
            System.out.println("Something went rong....");   //this block only runs if try block is not running
        }
        

        System.out.println(j);
        System.out.println("yeaaahhhh buddddy");
    }
    
}

/*- statemtns of two types
 i)normal statements
 Normal Statements:
Normal statements are statements that do not require any special handling, and they are executed in a normal sequence.  
e.g Variable declarations and assignments: These statements are used to declare and assign values to variables.

 ii)critical statements
Critical statements are statements that can cause an exception or error, and they require special handling.  
Handle using :
throw statements: These statements are used to throw an exception.
try-catch statements: These statements are used to handle exceptions.
finally statements: These statements are used to specify a block of code that is always executed, whether an exception is thrown or not.
 */