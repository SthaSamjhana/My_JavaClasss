/* how it works?
//it creates its super method  automatically 
// and super method will call constructor of  its super class  
 */
class A{
    public A(){
      super();
      System.out.println("in class A");
    }
    public A(int n1){
      super();
      System.out.println("in class  int ");
    }

}
class B extends A{
  public B()
  {
    super();
    System.out.println("in class B");
    //will call the paramitarised one

  }

  public B(int n1)
  {
    this(); //to pass the parameterized constructor if any value is not passing 

    System.out.println("in class B int "  + n1);

  }


}

public class ThisandSuper{

  public static void main(String args[]){
      B obj = new B( 5);
      

  }
}

//methodoverriding means having the same method namein sub classes as its super class
//same method name , same parameters type but different behaviour
//void does not return any values
//method overlaoding means same as overrriding but  it will be diff parameter types