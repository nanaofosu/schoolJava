/*(Conversion from kilograms to pounds) Write a program that displays the following
table (note that 1 kilogram is 2.2 pounds)*/

import java.util.Scanner;
class Chapter5_3 {

  public static void main(String[] args) {
    int x = 1;
    System.out.println("Miles Kilometers");
    while (x <11) {
      System.out.print(x + "\t");
      System.out.println((1.609f*x));
      x++;
    }
  }
}
