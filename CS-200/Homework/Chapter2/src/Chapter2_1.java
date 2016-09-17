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

public class Chapter2_1 {
    public static void main(String[] args){
        // Creating the scanner input variable
        Scanner in = new Scanner(System.in);
        // Define vars
        double cel, fahr;
        // prompt user for celcius value
        System.out.print("Welcome to the BUDU weather station! \n Enter the temperature in Celcius and we will convert it to Fahrenheit \n");
        
        cel = in.nextDouble();
        
        fahr = ((9/5d)*cel) + 32;
        
        System.out.println(cel + " Celcius is "+ fahr +" in Fahrenheit." );
    }
    
}
