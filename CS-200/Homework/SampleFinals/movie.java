import java.util.Scanner;

public class repeatValues{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int[] a = {1,2,3,4,5};
    int sum = 0;

    for(int i = 0; i<a.length; i++){
      sum = sum + a[i];
    }

    int[] b = new int[sum];
    sum =0;
    for(int i =0; i<a.length; i++){
      sum = sum + a[i];
      for(int k =sum-a[i]; k<sum; k++){
        b[k]=a[i];
      }
    }

   for(int i =0; i<b.length; i++){
    System.out.print(b[i]+" ");
   }

  }

}
