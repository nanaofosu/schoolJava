
public class  Chapter5_5 {
   public static void main(String[] args) {
    int x = 1; int y =20;

    System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
    while (x <200) {
      System.out.print(x + "\t\t\t");
      System.out.print((2.2f*x) + "\t\t\t | \t");
      x=x+2;

      System.out.print(y + "\t\t\t");
      System.out.println((y/2.2f));
      y = y+5;
    }
  }
}
