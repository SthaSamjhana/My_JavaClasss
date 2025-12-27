  class Human{
    //  private int age = 11;
    // private String name = "El"; what if i dont want to assign the valu here using privete  class 
    private int age;
    private String name;
    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }


    // public int  getAge()
    // {
    //   return age;
    // }

    // public void setAge(int a )
    // {
    //   age = a;
    // }

    // public String getName()
    // {
    //   return name;
    // }

    // public void setName(String n)
    // {
    //   name = n;
    // } 
   }

public class My_Encap {
 public static void main(String args[]){
    Human obj = new Human();
  // obj.age = 12;

    obj.setAge(33);
  // obj.name = "Sam";
    obj.setName("Sam");

  System.out.println(obj.getName() +":" +obj.getAge());
 }
  
}
