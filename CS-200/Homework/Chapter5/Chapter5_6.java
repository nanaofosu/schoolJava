/*(Conversion from miles to kilometers) Write a program that displays the following
two tables side by side*/
public class  Chapter5_6 {
   public static void main(String[] args) {
    int x = 1; int y =20;

    System.out.println("Miles\tKilometer\t|\tKilometers\tMiles");
    while (x <11) {
      System.out.print(x + "\t\t");
      System.out.print((1.609f*x) + "\t\t   | \t");
      x++;

      System.out.print(y + "\t\t\t   ");
      System.out.println((y/1.609f));
      y = y+5;
    }
  }
}
