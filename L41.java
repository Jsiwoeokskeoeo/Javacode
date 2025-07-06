class Human 
{
   //we can generate getters and setters by source action(right click to see)
    
   private int age; //this is instance
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {//this is local age variable
        this.age = age; //pehla age is instance and dusra is local
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     // agar ham ek hi naam use krna chahe getters aur setter mn tab use this
    //yahan pe age is referring to the current object whichh is obj which is calling the setter
}

public class L41
{
    public static void main(String a[]) 
    {
        Human obj = new Human();
        obj.setAge(50);
        obj.setName("rajul");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }

}
