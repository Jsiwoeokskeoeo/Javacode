class ABC
{
    public void playmusic()
    {

        System.out.print("MUSIC IS PLAYING....");
    }
     
    public String getpen()
    {
        return "PEN";
    }

}

public class Methods {

     public static void main(String a[])
     {
        ABC demo = new ABC();

        demo.playmusic();
        String str= demo.getpen();
        System.out.println(str);
     }
    
}
