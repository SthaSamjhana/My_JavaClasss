public class NewSwi {
  public static void main(String[] args){

    //Old Version or Switch statement goes like this

    // String day = "Sunday";

    // switch (day) {
    //       case "Saturday", "Sunday":
    //         System.out.println("10am");
    //           break;
    //         case "Monday":
    //           System.out.println("7am");
    //           break;
    //       default:
    //         System.out.println("6am");    }
    /* new updated version goes like this */

    String day = "none";
    String result = "";

    result=switch(day)
    {
      case "Saturday", "Sunday" : yield ("8am");
      case "Monday" : yield ("6am");
      default :yield ("5am");

    };
    System.out.println(result);


  }
}
