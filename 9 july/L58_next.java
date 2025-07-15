//case 2: class can override object class hashCode(), toString(), equals()
class Mobile{
    String model;
    int price;

    //these are pre generated methods called by source action
    @Override
    public String toString(){
        return "Model: "+model+" and price: "+price;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mobile other = (Mobile) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
 
}

class L58_next
{
    public static void main(String []args){
        Mobile mb1=new Mobile();
        mb1.model="Apple";
        mb1.price=100000;

        Mobile mb2=new Mobile();
        mb2.model="Apple";
        mb2.price=100000;

        //use of toString() method,  overrides method 
        System.out.println(mb1); //Internally mb1.toString() is called and print Model: Apple and price: 100000
        System.out.println(mb2); // Internally mb2.toString() is called and print Model: Apple and price: 100000
 
        //use of equals() method to compare two object, overrides method
        boolean result =mb1.equals(mb2); //right now it give true result because we override equals() method
        System.out.println(result); //true

        //use of hashCode()
       System.out.println(mb1.hashCode()); //1967873639 due to overrides hashcode method
       System.out.println(mb2.hashCode());  //1967873639  

       System.out.println(mb1==mb2); 
       /*== compares references, not content:
            mb1 == mb2 checks if both variables point to the exact same object in memory.

            Even though mb1 and mb2 have identical data, they are two different objects created using new. */
    }
}
