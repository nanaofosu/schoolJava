/*
Use nested loops that display the following
patterns in four separate programs
 */

import java.util.Scanner;

public class  Chapter5_24 {
   public static void main(String[] args) {
  //System.out.println("The second highest score is " + secondMax);

    double sum = 0;
    for(int i=0; i<=48; i++){
      sum = sum + ((2.0*i)+1)/((2.0*i)+3);
    }
    
    System.out.println("The sum is: "+ sum);
 }
}
