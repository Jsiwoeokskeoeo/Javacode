//wrapper class

public class L60 
{
    public static void main(String[] args) {
        
    
    int num=10;
    //Boxing:It is manual method to convert primitive type data into non-primitive type(i.e object)
    Integer num1 = new Integer(num);//this syntax is deprecated and gives warning
    Integer num5=Integer.valueOf(8); //Now we use this syntax

    //AutoBoxing::It is automatic conversion of primitive type data into non-primitive data type
    Integer num2= num;

    //Unboxing:It is manual method to convert non-primitive data type to primitive type.
    int num3 = num1.intValue();
    //AutoUnboxing:It is automatic conversion of non primitive type data into primitive data type.
    int num4= num2;

    System.out.println(num1);//its possible


    //-convert string into int type using parseInt

    String str="12";

    int n=Integer.parseInt(str); 
    //now we can perform operations
    System.out.println(n*2);

    //Convert number into String 
    String str1=Integer.toString(n*2); //convert number into string
    System.out.println(str1);
    }
}
