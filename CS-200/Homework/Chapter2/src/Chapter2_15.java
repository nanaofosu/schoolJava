import java.util.Scanner;

public class Chapter2_15{
  public static void main(String[] args) {
    /*define vars */
    Scanner in = new Scanner(System.in);

    double x1, x2, y1, y2, distance;

    System.out.println("Enter the values for x1, y1, x2, y2 : ");

    x1 = in.nextDouble();
    y1 = in.nextDouble();
    x2 = in.nextDouble();
    y2 = in.nextDouble();

    distance = Math.pow((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)),.5);

    System.out.println("The distance between the two points is " + distance);

  }
}
