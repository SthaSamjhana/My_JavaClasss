
class Laptop
    {
      String model;
      int price;
      
// object class method
       public String toString()
    {
      return model + " :" + price ;
    } 

    public boolean equals(Laptop that)
    {
      if(this.model.equals(that.model) && this.price ==that.price)
        return true;
      else
        return false;
    }
  }

   
public class Hashcode {
    public static void main(String[] args) {
      Laptop obj = new Laptop();
      obj.model = "Lenovo Yoga";
      obj.price = 1000;

      Laptop obj1 = new Laptop();
      obj1.model = "Lenovo Yoga";
      obj1.price = 1000;
      
      boolean result = obj.equals(obj1);

      System.out.println(result);
    }
}
