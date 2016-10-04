
import java.util.Scanner;

public class Chapter3_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, initialNum, lastDigit,midDigit, firstDigit, reversedNum;

        System.out.println("Enter a number: ");

        //Get the user input (121)
        num = in.nextInt();

        initialNum = num;

        //find out the last digit (1)
        lastDigit = num % 10;

        //discard the last digit. This is  now a shrunk number
        num = num/10;

        //get the middle number
        midDigit = num %10;

        num = num/10;

        // get the first number
        firstDigit = num;

        //append the last digit to the front and create a new look
        reversedNum = (((lastDigit*10)+midDigit)*10)+firstDigit;

        // check to see if palandrome
        if(initialNum == reversedNum){
            System.out.println(initialNum + " is a Palandrome");
        } else{
            System.out.println(initialNum + " is NOT a Palandrome");
        }


    }
}
