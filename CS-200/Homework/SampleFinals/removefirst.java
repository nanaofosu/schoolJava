public class removefirst{
 public static void main(String[] args) {
   int[] myarray = {1,3,4,5,6,7,8,4,1,1,3,4,5};
   once(myarray);
 }
  public static int[] once(int[] a){
    int[] b = new int[a.length] ;
    int pos = 0;
    //System.out.print("These appeared once   ");
    for(int i=0; i<a.length; i++){
      if(a[i] != a[0]){
        b[pos] = a[i];
        pos++;
      }

    }
    for(int i=0; i<b.length; i++){
      System.out.print(b[i]+" ");
    
    }
    
    
   return b;
  }
}
