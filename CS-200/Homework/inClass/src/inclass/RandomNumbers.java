import java.util.Scanner;

public class RandomNumbers{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double guess = Math.random()*10;

    System.out.println((int)guess+1);

  }
}
