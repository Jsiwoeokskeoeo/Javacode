class Calculator 
{
    public int add(int x, int y) 
    {
        return x + y;
    }

    public int add(int x, int y , int z )
    {
        return x+y+z;

    }

    public double add(int x , double y)
    {
        return x+y;
    }
}


public class Method_overloading 
{
    public static void main( String a[])
    {

        Calculator calc = new Calculator();

        //here now you can input values accordingly for sum of 2 or 3 no. of int or double datatype.
        //creating more than one methods of same name but having different type and different parameter is called method overloading
    }
    
}
