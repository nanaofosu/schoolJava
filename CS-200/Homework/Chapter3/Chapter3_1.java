import java.util.Scanner;


public class Chapter3_1 {
  public static void main(String[] args) {

    /*Define Vars*/
    Scanner in = new Scanner(System.in);
    double a, b, c, r1, r2, discriminant;

   //GET INPUT

    System.out.println("ENter a b and c: ");
    a = in.nextDouble();;
    b = in.nextDouble();
    c = in.nextDouble();

    discriminant = Math.pow(b,2) - (4*a*c);

   // CREATE FORMULAR
    r1 = ((-b)+Math.pow((Math.pow(b,2)-(4*a*c)),.5))/(2*a);
    r2 = ((-b)-Math.pow((Math.pow(b,2)-(4*a*c)),.5))/(2*a);


   if(discriminant > 0){
   System.out.println("The equation has two roots "+ r1 + " and "+ r2);
    }
    else if(discriminant == 0){
      System.out.println("The equation has one  root "+ r1);
    }
    else if(discriminant < 0){
      System.out.println("The equation has no real roots ");
    }

  }

}
