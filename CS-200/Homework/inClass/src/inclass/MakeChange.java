import java.util.Scanner;
public class MakeChange
{
   public static void main(String[] args)
   {
      Scanner inp = new Scanner(System.in);
      int totPennies, numQuarters, numDimes, numNickels, numPennies;
      totPennies = inp.nextInt();
      System.out.println( "For " + totPennies + " pennies you get: " );
      numQuarters = totPennies / 25;      
      totPennies = totPennies - numQuarters * 25;
      numDimes = totPennies / 10;      
      totPennies = totPennies - numDimes * 10;
      numNickels = totPennies / 5;      
      totPennies = totPennies - numNickels * 5;
      numPennies = totPennies;
      System.out.println( numQuarters + " quarters\n" + numDimes + " dimes\n" + numNickels + " nickels\n" + numPennies + " pennies." ); 
   }
}


/*
 
  ----jGRASP exec: java MakeChange -Xlint:unchecked
 88
 For 88 pennies you get: 
 3 quarters
 1 dimes
 0 nickels
 3 pennies.
 
  ----jGRASP: operation complete.
 


*/