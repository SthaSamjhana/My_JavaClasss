  //polimorphism- this will only work when you have interitance

  // final - variable, method, class if we use final keyword noone can be able to access or extends class variable methods
  
  class Computer{
    public void show(){
      System.out.println("Whaaaasuppp...?");
    }

  }
  class Laptop extends Computer{
  public void show(){
    System.out.println("Fuck Boy..👄(●'◡'●) ");
  }

}

 class C extends Computer{
  public void show(){
    System.out.println("Yes you (●'◡'●) ");
  }

}
public class Demo {
  public static void main(String[] args) {

    Computer obj = new Computer(); 
    obj.show();
    obj = new Laptop();
    obj.show();
    obj = new C();
    obj.show();
    
    
  }
  
}
