public class howmany{
 public static void main(String[] args) {
   int[] myarray = {1,2,3,4,5,6,11,2,2,1,4};
   once(myarray);
 }
  public static int once(int[] a){

    int count =0;

    System.out.print("These appeared once   ");


    for(int i = 0; i<a.length; i++){
      for(int j =0; j<a.length; j++ ){
        if(a[i] == a[j]){
          count++;
        }
      }
      if(count == 1){
        System.out.print(a[i]);
      }
      else{
        count = 0;
      }

    }


    return 1;
  }
}
