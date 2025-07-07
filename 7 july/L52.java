//method overriding
class Calc
{
    public int add(int a , int b)
    {
        return a+b;
    }
}
class AdvCalc extends Calc
{
    public int add(int a , int b)//ye vala run hoga
    {
        return a+b+1;
    }

}
    public class L52 
    {
        public static void main(String[] args) 
        {
            AdvCalc obj = new AdvCalc();
            System.out.println(obj.add(5, 15));
            
        }
    
}
