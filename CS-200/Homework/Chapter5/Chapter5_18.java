/*
Use nested loops that display the following
patterns in four separate programs
 */

import java.util.Scanner;

public class  Chapter5_18 {
   public static void main(String[] args) {
  //System.out.println("The second highest score is " + secondMax);


  int i,  j, counter;
  counter = 0;

  /*Pattern A*/
  System.out.println("Pattern A");
  for(i=1; i<=6; i++){
    for(j=1; j<=i; j++ ){
      System.out.print(j+ " ");
    }
    System.out.println("");
  }

  /*Pattern B*/
  System.out.println("\nPattern B");
  for(i=6; i>=1; i--){
    for(j=1; j<=i; j++){
      System.out.print(j + " ");
    }
    System.out.println("");
  }

  /*Pattern C*/

  int n =6;
  System.out.println("\nPattern C");

  for(i=0; i<n; i++){
    for(j=n; j>i; j--){
      System.out.print("  ");
    }
    for(j=0; j<i+1; j++){
      System.out.print(((j+1)+" "));
    }
    System.out.println("");
  }


  /*Pattern D*/
   System.out.println("\nPattern D");

    for(i=0; i<6; i++){

      for(j=0; j<i; j++){
        System.out.print("  ");
      }

      for(j=1; j<=6-i; j++){
        System.out.print(j+" ");
      }

      System.out.println("");

    }
 }
}
