/*
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
a = (v1 - v0)/t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration.
 */

/**
 *
 * @author NANAO
 */
import java.util.Scanner;

public class Chapter2_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        double initialVelocity, finalVelocity, time, accelaration;
        
        System.out.println("Enter the initial velocity, the final velocity, and then the time: ");
        
        initialVelocity = in.nextDouble();
        finalVelocity = in.nextDouble();
        time = in.nextDouble();
        
        accelaration = (finalVelocity -initialVelocity)/time;
        
        System.out.println("The average acceleration is: "+ accelaration);
    }
}
