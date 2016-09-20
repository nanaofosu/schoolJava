import java.util.Scanner;

public class Chapter2_17{
  public static void main(String[] args) {
    /*define vars */
    Scanner in = new Scanner(System.in);

    double ta, v, twc;

    System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
    ta = in.nextDouble();
    System.out.println("Enter the wind speed (>=2) in miles per hour: ");
    v = in.nextDouble();

    twc =  35.74 + (0.6215*ta) -(35.75*(Math.pow( v,0.16))) + ((0.4275*ta)*Math.pow(v, 0.16));

    System.out.println("The wind chill index is " + twc);
  }
}
