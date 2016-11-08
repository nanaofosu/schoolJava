

import java.util.Scanner;

public class longestRun{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("enter a string of number: ");


    int[] A = {81,81,39,17,39,17,17,17,81,81,39,39,39,39};

    longestRun(A);
  }

  public static int longestRun(int[] array){
    int count = 1; int run = 1;

    for(int i=0; i<array.length-1; i++){
     //detect a streak
     if(array[i]==array[i+1]){
      count++; //count the streak
     }
     else if( array[i]!=array[i+1]){
        if(count>run){
          run = count;
        }
        count = 1;
     }
    }
    if(count >run){
      run = count;
    }
    System.out.print("The longest Run is "+ run);
    return run;
  }

}
