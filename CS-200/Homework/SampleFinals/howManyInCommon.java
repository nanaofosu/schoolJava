import java.util.Scanner;

public class howManyInCommon{
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6,8,9,10};
    int[] b = {1,3,5,7};

    System.out.print(comparearray(a,b));
  }
  public static int comparearray(int a[], int b[]) {
    Scanner inp = new Scanner(System.in);
    int count = 0;

    for(int i =0; i<a.length; i++){
      for(int j =0; j<b.length; j++){
        if(a[i]==b[j]){
          count++;
        }
      }
    }

    return count;
  }
}
