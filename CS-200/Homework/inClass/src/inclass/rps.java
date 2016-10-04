

import java.util.Scanner;

public class rps{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double cG, uG;

    cG = (int)(Math.random()*3);
    uG = in.nextInt();

    if(cG = uG){ /* Nobody wins */
      if(cG == 0){
        System.out.println("Its a draw, you both chose 'ROCK'");
      }

      else if (cG == 1 ) {
        System.out.println("Its a draw, you both chose 'PAPER'");
      }
      else if (cG == 2 ) {
        System.out.println("Its a draw, you both chose 'SCISSORS'");
      }
    }

    else{
      if(cG == 0 && uG ==1){
        System.out.println("Its a draw, you both chose 'SCISSORS'");
      }
    }

  }
}
