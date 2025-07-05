class x
{     
    public static void main(String[] args) {
        
        byte b = 120;
        int a = b ;          //type conversion(implicit)
       // byte c = a;        this will not be performed
        int d = 130; 
        byte e = (byte)d;     // this is type casting(explicit)
        //also if the int is out of range the solution is (int value)%256
        float f =5.8f;
        int g = (int)f;




        byte h = 30;
        byte i = 10;
        int j = h*i;          //this is type promotion
        System.out.println(e);
    }
    
}
