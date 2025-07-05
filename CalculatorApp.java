class Calculator 
{
    public int add(int x, int y) 
    {
        return x + y;
    }
}

public class CalculatorApp 
{          //error raised due to not in capital letter of class name
    public static void main(String[] args)
    {
        int n1 = 5;
        int n2 = 19;

        Calculator calc = new Calculator();
        int result = calc.add(n1, n2);
        System.out.println(result);
    }
}
