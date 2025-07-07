class Calc
{
    public int add( int a , int b)
    {
        return a+b;
    }
}
public class Inheritance 
{
    public static void main(String[] args) 
    {
        AdvCalc obj = new AdvCalc();
        int c =obj.add(10, 9);
        System.out.println(c);
    } 
}
