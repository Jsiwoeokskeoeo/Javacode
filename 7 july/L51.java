//this and super method in java
//there are various methods to call default and parameterized constr of super and sub class
class A extends Object
{
        public A()
        {
            super();
            System.out.println("in a");
        }
        
        public A(int n)
        {
            super();
            System.out.println("in a int");
            
        }
    }
    
    class B extends A
    {
        public B()
        {
           this(10);
            //super();
            System.out.println("in b");
            
        }
        
        public B(int n)
        {
            //this();
            super(n);
            System.out.println("in b int");
            
        }
    }
    

public class L51 
{
    public static void main(String[] args) 
    {
         B obj = new B();
    }
    
}

/*
1. dont pass any value inside object
output:in a
        in b
        
2. passing int inside obj
      output: both parameterized calling

3. passing int value inside and having this instead of super in parameterized of b 
output will be :
in  a 
in b
in b int

4. dont pass any value along with this(int n )
u can chek by running
 */