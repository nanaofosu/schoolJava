/*(Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number*/

import java.util.Scanner;
class Chapter5_1 {

  public static void main(String[] args) {
    double input, sum;
    int neg, pos, count;
    Scanner inp = new Scanner(System.in);

    sum = 0.0; count = 0; neg = 0; pos = 0;

    System.out.print("Enter an integer, the input ends if it is 0: ");


    input = inp.nextDouble();
    while(input != 0){
            sum = sum + input;
      if (input <0){
        neg++;
      }else if (input>0) {
        pos++;
      }
      count++;
      input = inp.nextDouble();

    }
    System.out.println("The number of positives is "+ pos);
    System.out.println("The number of negatives is "+ neg);
    System.out.println("The total is "+ sum);
    System.out.println("The average is "+ (sum/count));

  }
}
