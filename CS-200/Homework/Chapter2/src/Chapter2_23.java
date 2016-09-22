/*
(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.
 */

import java.util.Scanner;

public class Chapter2_23{
  public static void main(String[] args) {
    /*define vars */
    Scanner in = new Scanner(System.in);
    double distance, mpg, gasPrice, drivingCost;


    // Get data from user
    System.out.print("Enter the distance in miles: " );
    distance = in.nextDouble();
    System.out.print("Enter the fuel efficency in miles per gallon (mpg): " );
    mpg = in.nextDouble();
    System.out.print("Enter the price of gas per gallon: " );
    gasPrice = in.nextDouble();

    drivingCost = distance*(1d/mpg)*gasPrice;

    System.out.print("The cost to drive is: "+ drivingCost);

  }
}
