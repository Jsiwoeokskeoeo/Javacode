public class MultiDarray 

{
    public static void main(String[] args) {
        
    
    int num[][] = new int[3] [4] ;// 3 arrays having each 4 elements
    



    for (int i=0 ; i<3; i++)
    {
        for(int j=0; j<4; j++)
        {
            num[i][j] = (int)(Math.random() * 100);    //Math.random() generates a double value less than 1
            System.out.println(num[i][j]);             //uper 10 se multiply bhi kr sakte
        }
    }
    
    for(int i=0; i<3; i++)
    {

        for(int j=0; j<4; j++)
        {
            System.out.print(num[i][j] + " ");
        }
        System.out.println();
    }
       

//enhanced for loop
    for(int n[] : num)
    {
        for (int m : n)
        { 
            System.out.print(m + " ");

        }
        System.out.println();
    }





        




}    
}