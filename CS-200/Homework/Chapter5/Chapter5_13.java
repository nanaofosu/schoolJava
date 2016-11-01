/*
(Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest
integer n such that n2 is greater than 12,000.
 */

import java.util.Scanner;

public class  Chapter5_13 {
   public static void main(String[] args) {
  //System.out.println("The second highest score is " + secondMax);

  int n=0;
  while(n*n*n < 12000 ){
    n++;
  }
  System.out.print(n-1);

 }
}
