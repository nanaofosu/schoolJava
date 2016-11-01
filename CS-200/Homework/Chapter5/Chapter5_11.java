/*(Find numbers divisible by 5 and 6) Write a program that displays all the numbers
from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
separated by exactly one space.*/

import java.util.Scanner;

public class  Chapter5_11 {
   public static void main(String[] args) {
  //System.out.println("The second highest score is " + secondMax);
  int i, itemCount;
  itemCount = 0;

  for(i=100; i<=200; i++){
    if(((i%5 == 0) || (i%6 == 0))&&(i%30!=0)){
      System.out.print(i+", ");
      itemCount++;
    }

    if(itemCount == 10){
      System.out.println("\n");
      itemCount = 0;
    }
  }

 }
}
