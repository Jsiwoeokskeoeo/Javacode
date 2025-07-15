//lambda expression
@FunctionalInterface      
interface A
{
	void show(int interfaces);

}


public class L74 {
    public static void main(String[] args) {
    	
    	//   A obj=  ()->System.out.println("in Show");   //lambda expression if there are no values to be given
    	  A obj=  (i)->System.out.println("in Show" + i);     //marji hai tell datatype but no need uper toh kia hai

          //here more variables can also be there and if only one no need to keep i in parenthesis
    	obj.show(15);
    }
}

/*
 #1 what is lambda expression in java?
-- In Java, a lambda expression is a concise way to implement a functional interface. 

#2 Properties of the lambda expression
Concise syntax: Lambda expressions provide a concise and expressive syntax for defining functional interfaces. 
They allow you to define the behaviour of a functional interface in a single line of code.

Functional programming: Lambda expressions are a key component of functional programming in Java. 
They allow you to write code that is more declarative and expressive, and less verbose than traditional imperative code.

No need for anonymous inner classes: Lambda expressions provide an alternative to anonymous inner classes, which are often 
used to implement functional interfaces in Java. Lambda expressions are more concise and easier to read than anonymous inner classes.

 */