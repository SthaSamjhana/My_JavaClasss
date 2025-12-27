class Computer{
   public int add(int n1, int n2, int n3)
   {
    return n1+ n2 +n3;

   }
   public int add1(int n1, int n2){
    return n1+n2;

   }
   //same parameters or diff parameters or same variables name with different data types or ... is called method over loading.
   public double add3(double n1, int n2){
    return n1+n2;
   }
}


public class MyMethodOverloading {
  public static void main(String[] args){
      Computer obj = new Computer();
      int r1 = obj.add(3, 4,5);

      int r2 = obj.add1(2, 4);
      double r3 = obj.add3(2, 3);
      System.out.println(r3);
  }
}
