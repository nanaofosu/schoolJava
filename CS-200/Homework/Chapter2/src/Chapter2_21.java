/*
(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and displays
the future investment value
 */

import java.util.Scanner;

public class Chapter2_21{
  public static void main(String[] args) {
    /*define vars */
    Scanner in = new Scanner(System.in);

    double futureInvestmentValue, investmentAmount, annualInterestRate, numberOfYears;

    // Collect data from user
    System.out.print("Enter investment amount:");
    investmentAmount = in.nextDouble();

    System.out.print("Enter annual interest rate in percentage:");
    annualInterestRate =  in.nextDouble();

    System.out.print("Enter number of years:");
    numberOfYears = in.nextDouble();
     
    /*
      Since we are taking in the annual rate, we have to devide it by 12 to get the monthly rate
    */
    futureInvestmentValue = investmentAmount * Math.pow(1+(annualInterestRate/1200),numberOfYears*12 );

    System.out.print("Accumulated value is: " +futureInvestmentValue);

  }
}
