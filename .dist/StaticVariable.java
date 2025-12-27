
class Mobile{
  String brand;
  int price;
   static String name;

      public void show(){
        System.out.println( brand + ":" + price + ":" + name);
      }

      public  static void show1(Mobile obj )  //static method
      {
        System.out.println("this is static method");
        System.out.println( obj.brand + ":" + obj.price + ":" + name);
      }
}

public class StaticVariable {
  public static void main(String[] args) {

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 30202;
    obj1.name = "Iphone_14";

     Mobile obj2 = new Mobile();
    obj2.brand = "Apple";
    obj2.price = 30202;
    obj2.name = "Iphone_14";
      
    Mobile.name = "Phone";
    obj1.show();
    obj2.show();

  Mobile.show1(obj1);
    
  }
  
}
