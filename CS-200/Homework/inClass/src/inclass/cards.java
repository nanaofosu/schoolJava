
import java.util.Scanner;

public class cards{
  public static void main(String[] args) {

    int card, suit;
    /*
    0 - 12 diamonds
    13 - 25 hearts
    26 - 38 spades
    39 - 51 clubs
     */

    card = (int)(Math.random()*51);

    if(card<=12){
      System.out.print(card + " is a diamond");
    }


  }
}
