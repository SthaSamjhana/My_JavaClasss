/*
1.public - can be access from anywhere
2. private - can be access only from same class
3.default- can be access from same package
-try to avoid defult
4. protectrd - can be access from diff package but subclass  */
import tools.*;
public class AccessModi {
  public static void main(String[] args) {

    SubofAccess obj = new SubofAccess();
    System.out.println(obj.marks);

    SubB obj2 = new SubB();
    System.out.println(obj2.marks); //  in same package can be access even without mentioning public 
  }
  
}
