

import java.util.Scanner;

public class methods_new{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int user_val = in.nextInt();

    prime(user_val);

  }

  public static boolean prime(int val){
    Scanner in = new Scanner(System.in);
    int count = 0;

    for(int i=1; i<=val; i++){
      if(val%i == 0){
        count++;
      }
    }
    if(count == 2){
      System.out.println(val + " is a prime");
      return true;
    }
    else{
      System.out.println(val + " is a not prime");
      return false;
    }
  }

}
