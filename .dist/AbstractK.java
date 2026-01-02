  abstract class Car {

  public abstract void drive();

  public abstract void fly();

  

  public void playMusic(){
    System.out.println("play music");

  }
 }
   abstract class Mustang extends Car{

    // public void fly(){
    //   System.out.println("Flying...");
    // }
    public  void drive(){
      System.out.println("drive the car...");
    }
  }

  class UpdatedMustang extends Mustang{
     public void fly(){
      System.out.println("Flying...");
    }
  }

public class AbstractK {
  public static void main(String[] args) {
  
  Car obj = new UpdatedMustang();
  obj.fly();
  obj.drive();
  obj.playMusic();
}
  
}
