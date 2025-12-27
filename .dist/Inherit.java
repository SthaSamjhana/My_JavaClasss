import tools.Calc;
public class Inherit {
  public static void main(String[] args) {
    AdvCalcPro obj = new AdvCalcPro();
    Calc obj1 = new Calc();
    int num1 = obj.add(4, 5);
    int num2 = obj.sub(10, 5);
    int m = obj.multi(10, 5);
    int d = obj.div(10, 5);
    double p = obj.power(2, 2);

    System.out.println(num1 + "  And" + num2);
    System.out.println(m + "  And" + d  + " " + p);

  }
  
}
