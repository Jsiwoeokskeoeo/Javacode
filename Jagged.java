public class Jagged

{
    public static void main(String[] args) {
        
    
    int num[][] = new int[3] [] ;// 3 arrays having each 4 elements

     num[0] = new int[3];
     num[1] = new int[4];
     num[2] = new int[2];
    for (int i=0 ; i<num.length; i++) //num.length tell no. of rowws
    {
        for(int j=0; j<num[i].length; j++)    //num[i].length tells the size at each index
        {
            num[i][j] = (int)(Math.random() * 100);    //Math.random() generates a double value less than 1
            System.out.println(num[i][j]);             //uper 10 se multiply bhi kr sakte
        }
    }
    //enhanced for loop
    //it doesnt require any size
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