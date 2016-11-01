import java.util.Scanner;


public class Chapter3_2 {
  public static void main(String[] args) {

    /*Define Vars*/
    Scanner in = new Scanner(System.in);
    int int1, int2, int3;

    /* GENERATE 2 INTS*/
    int1 = (int)(Math.random() * 10);
    int2 = (int)(Math.random() * 10);
    int3 = (int)(Math.random() * 10);


    System.out.println("Add up "+ int1 +", " + int2+ ", and " + int3);


  }

}
