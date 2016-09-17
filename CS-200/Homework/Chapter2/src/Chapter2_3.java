/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANAO
 */

import java.util.Scanner;

public class Chapter2_3 {
    public static void main(String[] args){
        // Creating the scanner input variable
        Scanner in = new Scanner(System.in);
        // Define vars
        double foot, meter, meterRatio;
        // prompt user for celcius value
        
        meterRatio = 0.3048;
        
        System.out.println("Enter the value in feet");
        
        foot = in.nextDouble();
        
        meter = foot*meterRatio;
        
        System.out.println(foot + "ft in metere is " + meter);
    }
    
}
