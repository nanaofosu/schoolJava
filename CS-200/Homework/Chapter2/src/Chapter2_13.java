/*
Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month.
 */

import java.util.Scanner;

public class Chapter2_13 {
  public static void main(String[] args) {

    /*Defining variables */
    Scanner in = new Scanner(System.in);
    double rate, deposit, amount, time, compound;

    amount = 0;

    /*
      formular:
        amount = deposit*(1+rate/12.0)
        amount = (deposit + amount)*(1+rate/12)
        amount = (deposit + amount)*(1+rate/12)
        amount = (deposit + amount)*(1+rate/12)
        amount = (deposit + amount)*(1+rate/12)

        amount = deposit*( 1+(rate/12.0) ) ^ time
     */


    System.out.println("ENter a rate and an amount: ");

    rate = in.nextDouble();
    deposit = in.nextDouble();
    
    amount = deposit*(1+rate/12.0);
    amount = (deposit + amount)*(1+rate/12);
    amount = (deposit + amount)*(1+rate/12);
    amount = (deposit + amount)*(1+rate/12);
    amount = (deposit + amount)*(1+rate/12);
    amount = (deposit + amount)*(1+rate/12);

    

    System.out.println("After 6 months, your total is "+ amount);

  }
}
