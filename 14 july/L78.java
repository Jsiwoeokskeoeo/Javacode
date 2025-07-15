//try with multiple catch

public class L78 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int s[] = new int[4];
        String str = null;

        try {
            j = 16 / i;                //agar isme error aaya toh iska exception return hoga order wise chalega maamla
            System.out.println(s[4]);
            System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("division by zero not possible");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("not present the index");
        } catch (Exception e) // exception is a class in itself which is parent class of above both exceptions
                              // and always must be at last catch block otherwise no use in the top .
                              // Exception is a sub class of throwable
        {
            System.out.println("Something went rong....");
        }

        System.out.println(j);
        System.out.println("yeaaahhhh buddddy");
    }

}
