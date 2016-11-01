/*(Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score.*/

import java.util.Scanner;

public class  Chapter5_8 {
   public static void main(String[] args) {
    int num, x;
    double score, big;
    big = 0;
    String name, bigName;
    bigName = "none";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of students:" );
    num = in.nextInt();


    for(x=0; x<num; x++){
      System.out.println("Enter the next student’s name and score:" );
      name = in.next();
      score = in.nextDouble();

      if(score > big){
        big = score;
        bigName = name;
      }
    }
    System.out.println("The student with the greatest score is :" + bigName + " with a score of "+ big );


  }
}
