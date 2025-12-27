class Human{
  private int age; //instance variable
  private String name;


    

  public int getAge() {
    return age;
  }


  public void setAge(int age, Human obj)  //Local variable
  {
    Human obj1 = obj;
    obj1.age = age; // instead of doig this all we can use this keyword
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


}

public class ThisKey {
  public static void main(String[] args) {

    Human obj = new Human();
   

    obj.setAge(23, obj);
    obj.setName("Samjhana");

    System.out.println(obj.getName()+ ":" +  obj.getAge());
    
  }
  
}
