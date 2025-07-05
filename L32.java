//ARRAY OF OBJECTS


class Student
{

    int marks;
    String name;
    int roll_no ;

}

public class L32
{

    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.marks = 99;
        s1.name ="OM";

        
        Student s2 = new Student();
        s2.marks = 90;
        s2.name ="LEO";

        Student s3 = new Student();
        s3.marks = 93;
        s3.name ="HARRY";

        Student student[] = new Student[3];   //we made array of objects

        student[0]= s1;
        student[1]= s2;
        student[2]= s3;

        //one method of printing the object
        System.out.println(s1.name + " - " + s1.marks);

        //other method to print the array
        for (int i=0; i<student.length; i++)
        {
            System.out.println(student[i].name + "-" + student[i].marks );
        }

        //enhanced for loop
        for ( Student stud : student)
        {
            System.out.println(stud.name + "-" + stud.marks );
        }


        
    }


}