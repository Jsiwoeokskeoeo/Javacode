//lambda expression with return
@FunctionalInterface      
interface A
{
	int add(int i, int j);

}


public class L75 {
    public static void main(String[] args) {
    	
    	A obj=  (i, j )-> i+j;  //this is the compact and i+j is of return type itself

       /*  A obj=  (i, j )-> 
        {
            return i+j;
        } ;
         */
         
    	obj.add(15,6);
    }
}