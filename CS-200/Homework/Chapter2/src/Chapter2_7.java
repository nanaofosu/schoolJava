/*
 * (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
 */

/**
 *
 * @author NANAO
 */
import java.util.Scanner;

public class Chapter2_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int mins, days, years;
        
        System.out.println("Enter the number of minutes: ");
         mins = in.nextInt();
         
         /*
            60mins = 1hour and 24 hours = 1day.
            So 60*24 = 1440 mins = 1day.
            365 days  = 1 year, so 365days *3600mins = 1year = 1,314,000 mins
         */
         
         years = mins/525600;
         
         mins = mins - (years*525600);
         
         days = mins/(60*24);
         
         System.out.println(mins + " minutes is about " + years + " years and " + days + " days");
         
    }
}
