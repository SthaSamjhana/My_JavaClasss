class A {
  public void show()
  {
    System.out.println("in A show");
  }

  
}

public class Anony {

  public static void main(String a[]){
    A obj = new A()
      {
        public void show()
        {
          System.out.println("in new show");
        }
      };

    obj.show();


  }
}
