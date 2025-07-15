//if and switch in java       enum cant be extended as a normal class but other all features are there 


enum Status                 
{
    Running ,Pending , Failed , Success;                   

}


public class L69 
{
    public static void main( String[] args)
    {
         Status s = Status.Failed;
         System.out.println(s.getClass().getSuperclass());      //this tells the super class which is java.lang.Enum

         if (s==Status.Failed)
         {
            System.out.println("try again");
         }
         else if (s==Status.Running)
         {
            System.out.println("wait");
         }
        else  if (s==Status.Pending)
         {
            System.out.println("nothingg");
         }
        else
         {
            System.out.println("Success");
         }


        //In switch case, we do not have to pass the object refernce variable again and again. We have to only pass the constant itself
        
        
        
         switch(s)
         {
            case Running: System.out.println("Done");
            break;
            case Pending: System.out.println("nothing");
            break;
            case Failed: System.out.println("chl nikal");
            break;
            default : System.out.println("Done");
            
         }
    }
    
}
