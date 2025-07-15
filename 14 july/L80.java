//throw keyword
//throw keyword in Java is used to explicitly throw an exception. 
//When an exception is thrown using the throw keyword, the execution of the current method is stopped.
public class L80 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        //suppose i>16 then j will be 0 and we dont want it we can use throw keyword 
        try {
            j = 16 / i;      
            if (j==0)
            {    throw new ArithmeticException("I dont want to print 0");         //we can also write a message inside it
            }                      
          

        } 
        
        //we can not only raise exception but can also handle it
        //suppose there is exception then this block will give the defualt value 
        catch (ArithmeticException e) {
            j=16/1;
            System.out.println("thats the default output" + e);
        } 
        
        catch (Exception e) 
        {
            System.out.println("Something went rong....");
        }

        System.out.println(j);
        System.out.println("yeaaahhhh buddddy");
    }

}
