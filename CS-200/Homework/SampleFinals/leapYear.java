

import java.util.Scanner;

public class leapYear{
  public static void main(String[] args) {
    int year;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a year: ");

    year = in.nextInt();
    isLeapYear(year);

  }

  public static boolean isLeapYear(int year){
    boolean value = true;
    boolean a = (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0);
    boolean b = (year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0);
    boolean c = (year % 4 == 0) && (year % 100 != 0) && (year % 400 != 0);
    if(a || b || c){

        System.out.print(year +" is a leap year");
        value = true;


    }
    else{
       System.out.print(year +" is not a leap year");
       value = false;

    }
    return value;
      }

}
