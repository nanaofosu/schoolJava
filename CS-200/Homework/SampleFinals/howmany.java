public class howmany{
 public static void main(String[] args) {
   int[] myarray = {1,2,3,4,5,6,11,2,2,1,4};
    System.out.print(once(myarray));
 }
  public static int once(int[] a){
    int returnCount = 0;


    System.out.print("These appeared once   ");


    for(int i = 0; i<a.length; i++){
      int count =0;
      for(int j =0; j<a.length; j++ ){
        if(a[i]==a[j]){
          count++;
        }
      }
      if(count == 1){
        returnCount++;
      }
    }
    //System.out.print(returnCount);
    return returnCount;
  }
}
