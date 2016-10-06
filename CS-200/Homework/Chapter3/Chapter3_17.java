
import java.util.Scanner;

public class Chapter3_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

          // Generate an int vatlue
        int cValue = (int)(Math.random()*2+1);
        System.out.println("Enter 0,1,2");

        int uVaue = in.nextInt();

        if(cValue == uVaue){
            System.out.println("Its a draw");
        }
        else if(cValue == 0){
            if(uVaue == 1){
                System.out.println("You chose paper. Computer chose rock. You win!");
            }
            else if (uVaue == 2){
             System.out.println("You chose scissors. CPU chaose rock. You lose.");
            }
        }else if (cValue == 1) {
            if(uVaue == 0){
                System.out.println("You chose rock. Computer chose paper. You lose!");
            }
            else if (uVaue == 2){
             System.out.println("You chose scissors. CPU chaose paper. You win.");
            }
        }else if (cValue == 2) {
            if(uVaue == 0){
                System.out.println("You chose rock. Computer chose scissors. You win!");
            }
            else if (uVaue == 1){
             System.out.println("You chose paper. CPU chaose scissors. You lose.");
            }
        }
    }
}
