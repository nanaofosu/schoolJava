/*
 (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total. Here is a sample run:
 */

/**
 *
 * @author NANAO
 */
 
 import java.util.Scanner;
 
public class Chapter2_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double subTotal, rate, gratuity, total;
        
        System.out.print("Enter the subtotal and a gratuity rate: ");
        
        subTotal = in.nextDouble();
        
        rate = in.nextDouble();
        
        gratuity = (rate*subTotal)/100d;
        total = subTotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total );
    }
}
