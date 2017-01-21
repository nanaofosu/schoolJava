import java.util.Scanner;

public class indexoffirstPair{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
     int[] a = {1,2,3,4,5,5,6,6,7,7,8,8,9,9};
     int index = 0;


     for(int i = 0; i<a.length; i++){
        if((a[i]==a[i+1]||a[i]==a[i-1]) && !(a[i]==a[i+1]&&a[i]==a[i-1]) ){
          index = i;
          break;
        }
     }

    System.out.println("the index is at" + index);
  }

}