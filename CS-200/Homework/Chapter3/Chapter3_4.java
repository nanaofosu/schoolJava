import java.util.Scanner;


public class Chapter3_4 {
  public static void main(String[] args) {

    /*Define Vars*/
    Scanner in = new Scanner(System.in);
    int monthVal;

    /* GENERATE 2 INTS*/
   monthVal = (int)(Math.random() * 12)+1;

   switch (monthVal) {
    case 1: System.out.println("Janruary");
    break;
    case 2: System.out.println("February");
    break;
    case 3: System.out.println("March");
    break;
    case 4: System.out.println("April");
    break;
    case 5: System.out.println("May");
    break;
    case 6: System.out.println("June");
    break;
    case 7: System.out.println("July");
    break;
    case 8: System.out.println("August");
    break;
    case 9: System.out.println("September");
    break;
    case 10: System.out.println("October");
    break;
    case 11: System.out.println("November");
    break;
    case 12: System.out.println("December");
    break;
    default: System.out.println("The world has ended");
    System.exit(1);
    }


  }

}
