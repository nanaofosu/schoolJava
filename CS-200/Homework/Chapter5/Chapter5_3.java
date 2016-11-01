/*(Conversion from kilograms to pounds) Write a program that displays the following
table (note that 1 kilogram is 2.2 pounds)*/

import java.util.Scanner;
class Chapter5_3 {

  public static void main(String[] args) {
    int x = 1;
    System.out.println("Kilograms Pounds");
    while (x <200) {
      System.out.print(x + "\t");
      System.out.println((2.2f*x));
      x=x+2;
    }
  }
}
