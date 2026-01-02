class A{
   private int age;
  

  public int getAge() {
    return age;
  }


  public void setAge(int age) {
    this.age = age;
  }


   static class B{
    public void config()
    {
      System.out.println("in config");
    }

  }
}


public class InnerClass {
  public static void main(String[] args) {
    A obj = new A();
    obj.setAge(23);
    System.out.println(obj.getAge());;
    //  A.B obj1 = obj.new B();
    A.B obj1 =  new A.B(); //with static
    obj1.config();
  }
  
}
