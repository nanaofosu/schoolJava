import java.util.Scanner;

public class moneyMatters{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

     int value, red_val, quarters, nickle, pennies;

     System.out.println("enter an integer: ");
     value = inp.nextInt();
     // if(value>99){
     //  while (value>99) {
     //    value = value % 100; //get only the cents.
     //  }
     // }

     System.out.println("To make " + value + " cents, you need to.");

     quarters = value/25;
     value = value % 25;
     nickle = value/5;
     pennies = value%5;

    System.out.println(quarters + " quarters");
    System.out.println(nickle + " nickle");
    System.out.println(pennies + " pennies");

  }

}
