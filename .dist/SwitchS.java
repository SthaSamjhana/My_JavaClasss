public class SwitchS {
  public static void main(String[] args) {
    
    int n = 2;
    // if(n==1) instead of this if else statement we will use switch statement for better reading processing
    //   System.out.println("Sunday");
    // else if(n==2)
    //   System.out.println("Monday");
    // else if(n==3)
    //   System.out.println("Tuesday");
    // else if(n==4)
    //   System.out.println("Wednesday");
    // else if(n==5)
    //   System.out.println("Thursday");
    // else if(n==6)
    //   System.out.println("Friday");
    //   else 
    //   System.out.println("Saturday");

    switch(n){
         case 1:
                System.out.println("Sunday");
                break;
              case 2:  
                  System.out.println("Monday");
                  break;
              case 3:
                  System.out.println("Tuesday");
                  break;
              case 4:
                  System.out.println("Wednesday");
                  break;
              case 5:
                  System.out.println("Thursday");
                  break;
              case 6:
                  System.out.println("Friday");
                  break;
             case 7:
                  System.out.println("Saturday");
                  break;
                  default:
                    System.out.println("Invalid ");
              }
  }
  
}
