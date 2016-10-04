/*
(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
*/
import java.util.Scanner;

public class Chapter3_8{
 public static void main(String[] args) {
  // Create a Scanner
  Scanner input = new Scanner(System.in);

  int  a, b, c;

  // a = (int)(Math.random()*20);
  // b = (int)(Math.random()*20);
  // c = (int)(Math.random()*20);
  //
  a = 2;
  c =1;
  b=3;

  if(a<=b && b<=c){
    System.out.println(a + ","+b+"," + c);
  }
  else if (b<=a && a<=c) {
      System.out.println(b + ","+a+"," + c);
  }
  else if (c<=b && b<=a) {
      System.out.println(c+ ","+b +"," + a);
  }
  else if (a<=c && c<=b) {
      System.out.println(a+ ","+c+"," + b);
  }
  else if (b<=c && c<=a) {
      System.out.println(b+ ","+c+"," + a);
  }
   else if (c<=a && a<=b) {
      System.out.println(c +","+a+"," + b);
  }



 }
}
