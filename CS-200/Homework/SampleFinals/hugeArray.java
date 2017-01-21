import java.util.Scanner;

public class hugeArray{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
     int[] a = new int[9999];
     int value, count;
     count = 0;

     for(int i = 0; i<9999; i++){
      System.out.println("Enter an int");
      value = inp.nextInt();

      if(a[value]!=value){
        a[value] = value;
        count++;
      }
      else{
        break;
      }
     }
     System.out.println("You entered "+count);
  }

}
