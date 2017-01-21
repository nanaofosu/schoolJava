import java.util.Scanner;

public class largestval{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
     int[] a = {12,2,3,4,5,6,7,8,9};
     int[] b = {1,2,3,4,5,6,7,8,9,12};
     int value, largest;
     largest = -1;

     for(int i =0; i<a.length; i++){
      for(int j =0; j<b.length; j++){
        if(a[i]==b[j]){
          if(a[i]>largest){
            largest = a[i];
          }
        }
      }
     }
    System.out.println("The lagest was "+largest);
  }

}
