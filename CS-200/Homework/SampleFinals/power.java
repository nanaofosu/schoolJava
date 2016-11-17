import java.util.Scanner;

public class power{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int product = 1; int a, b;
    System.out.print("Enter a");
    a = inp.nextInt();
    System.out.print("Enter b");
    b = inp.nextInt();

    for(int i =0; i<b; i++){
      product = product*a;
    }

    System.out.print(a + " to the power of " + b + " is " + product);
  }
}
