class Mobile {

      String brand;
      int price;
      static String name;

      static
      {
          name = "S23";
          System.out.println("in static block");
      } 
      
      //cunstroctor
      public Mobile(){
        brand = "Android";
        price = 202000;
        System.out.println("in cunstroctor");
        
    
      }
       

      public void show()
      {
        System.out.println(brand + ":" + price +":" + name);
      }
    
  }

public class StatickBlock{
  public static void main(String[] args) throws ClassNotFoundException`
  {

    Class.forName("Mobile");

    // Mobile obj1 = new Mobile();
    // obj1.brand = "Apple";
    // obj1.price = 150000;
    // Mobile.name = "SmartPhone";
    
   
    // Mobile obj2 = new Mobile();

    // obj1.show();
    // obj2.show();


   
  }
  
}
