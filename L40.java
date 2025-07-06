class Human 
{
    // we can use this variables only in this class only
    private int age; // if initialised variables use only getmethods
    private String name;

    // this method can be used by the object of the other class
    //getter
    public int getAge() 
    {
        return age;
    }

    // using set methods to set age in other class
    //setter
    public void setAge(int a) 
    {
        age = a;
    }

    public String getname() 
    {
        return name;
    }

    public void setname(String n) 
    {
        name = n;
    }

}

public class L40 
{
    public static void main(String a[]) 
    {
        Human obj = new Human();
        obj.setAge(50);
        obj.setname("rajul");
        System.out.println(obj.getAge());
        System.out.println(obj.getname());
    }

}
