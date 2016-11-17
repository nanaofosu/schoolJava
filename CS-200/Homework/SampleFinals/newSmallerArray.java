import java.util.Scanner;

public class newSmallerArray{
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,8,9,10,2,4,5,6,7,3,2,3,4,5,6,7,5};
    int b = 5;



    printArray(comparearray(a,b));
  }
  public static int[] comparearray(int a[], int b) {
    int count =0;
    for(int i = 0; i<a.length; i++){
      if(a[i]!=b){
        count++;
      }
    }
    System.out.println(b + " Appears "+ (count)+ " times.");
    int[] c = new int[count]; int i =0;

    for(int j=0; j<a.length; j++){
      if(a[j]!=b){
        c[i] = a[j];
        i++;
      }
    }

    return c;
  }
  private static void printArray(int[] anArray) {
      for (int i = 0; i < anArray.length; i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(anArray[i]);
      }
   }
}
