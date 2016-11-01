/*
Use nested loops that display the following
patterns in four separate programs
 */

import java.util.Scanner;

public class  Chapter5_29 {
   public static void main(String[] args) {
  //System.out.println("The second highest score is " + secondMax);
  Scanner in = new Scanner(System.in);
  int year, day;
  int numberOfDaysInMonth =0;

  System.out.println("Enter the year and the first day of the year. 0 for Sunday, 1 for Monday, etc. \n In the form Year/day");

  year = in.nextInt();
  day = in.nextInt();

  for(int month=1; month<=12; month++){ //loop through months;

    switch(month){
      case 1:
          System.out.println("January " + year);
          numberOfDaysInMonth = 31;
          break;
      case 2:
          System.out.println("February " + year);
          if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
              numberOfDaysInMonth = 29;
          } else {
              numberOfDaysInMonth = 28;
          }
          break;
      case 3:
          System.out.println("March " + year);
          numberOfDaysInMonth = 31;
          break;
      case 4:
          System.out.println("April " + year);
          numberOfDaysInMonth = 30;
          break;
      case 5:
          System.out.println("May " + year);
          numberOfDaysInMonth = 31;
          break;
      case 6:
          System.out.println("June " + year);
          numberOfDaysInMonth = 30;
          break;
      case 7:
          System.out.println("July " + year);
          numberOfDaysInMonth = 31;
          break;
      case 8:
          System.out.println("August " + year);
          numberOfDaysInMonth = 31;
          break;
      case 9:
          System.out.println("September " + year);
          numberOfDaysInMonth = 30;
          break;
      case 10:
          System.out.println("October " + year);
          numberOfDaysInMonth = 31;
          break;
      case 11:
          System.out.println("November " + year);
          numberOfDaysInMonth = 30;
          break;
      case 12:
          System.out.println("December " + year);
          numberOfDaysInMonth = 31;
      }
      System.out.println("*************************");
      System.out.println(" Sun Mon Tue Wed Thu Fri Sat");


      for (int i = 0; i < day; i++) {
        System.out.print("    ");
      }

      for(int j = 1; j<=numberOfDaysInMonth; j++){
                if(j <10){
           System.out.print("   " +j);
        }
        else{
          System.out.print("  " +j);

        }

        if((j+day)%7==0){
          System.out.println("");
        }

      }
      System.out.println("");

    }


 }
}
