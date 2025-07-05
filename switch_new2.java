class x 
{
     
    public static void main(String[] args) 
    {
        
           String day = "Monday" ;
           String result=""; //making an empty string



//using switch as an expression
           result=switch(day)
           {

                   case "Monday", "Sunday"  ->   "6AM";           //remove -> by (: yield) for ur ease
                   
                   case "Wednesday"  -> "8am";
                   
                   default -> "9am";


           };

               System.out.println(result);

    }



}
