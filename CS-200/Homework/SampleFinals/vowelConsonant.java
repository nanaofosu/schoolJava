

import java.util.Scanner;

public class vowelConsonant{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter two strings ");
    String first = in.next();
    String second = in.next();

    filter(first, second);
  }

  public static String filter(String a, String b){
    //find the vowels in string a

    char aa[] = a.toUpperCase().toCharArray();
    char bb[] = b.toUpperCase().toCharArray();

    char[] vowel = new char[aa.length];
    char[] consonant = new char[bb.length];

    for(int i=0; i < aa.length; i++){ //get a string of the vowels
       if(aa[i] == 'A' || aa[i] == 'E' || aa[i] == 'I'
         || aa[i] == 'O' || aa[i] == 'U'){
         System.out.print(aa[i]);
       }
    }

    for(int i=0; i < bb.length; i++){ //get a string of the consonants
       if(bb[i] != 'A' && bb[i] != 'E' && bb[i] != 'I'
         && bb[i] != 'O' && bb[i] != 'U'){
         System.out.print(bb[i]);
       }
    }
    return "worked";
  }

}
