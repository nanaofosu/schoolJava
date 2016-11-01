/*
(Compute the greatest common divisor) Write a program that prompts the user to
enter two positive integers and displays the gcd.
 */

import java.util.Scanner;

public class  Chapter5_14 {
   public static void main(String[] args) {
  //System.out.println("The second highest score is " + secondMax);

  int gcd, int1, int2, i, lowerNum;
  gcd = 0;
  Scanner inp = new Scanner(System.in);

  System.out.println("Enter 2 possitive integers.");

  int1 = inp.nextInt(); int2 = inp.nextInt();

  //I will be begining with the lower number and counting down to see what the first number is that gives us a
  //modulus of 0

  if(int1<int2){
    lowerNum = int1;
  }else{
    lowerNum = int2;
  }

  for(i = lowerNum; true ; i--){
    if((int1 % i) == 0 && (int2 % i)== 0 ){
      gcd = i;
      break;
    }
  }

 System.out.println("The GCD is " + gcd);



 }
}
