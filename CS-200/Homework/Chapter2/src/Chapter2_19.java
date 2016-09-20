/*
(Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 */

import java.util.Scanner;

public class Chapter2_19{
  public static void main(String[] args) {
    /*define vars */
    Scanner in = new Scanner(System.in);

    System.out.print("Enter three points for a triangle:");
    double x1 = in.nextDouble();
    double y1 = in.nextDouble();
    double x2 = in.nextDouble();
    double y2 = in.nextDouble();
    double x3 = in.nextDouble();
    double y3 = in.nextDouble();

    double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
    double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
    double s = (side1 + side2 + side3) / 2;
    double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    System.out.print("The area of the triangle is  " + area);

  }
}
