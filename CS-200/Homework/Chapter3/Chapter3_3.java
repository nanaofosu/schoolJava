import java.util.Scanner;
public class Chapter3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double x = input.nextDouble();
        double y = input.nextDouble();

        //Calculate
        double cramerX = (a*x) +(b*y);
        double cramerY = (c*x) + (d*y);



        if (((a*d)-(b*c) < 0) == true) {
        System.out.println("The equation has no solution");
        }
        else {
          System.out.println("x is " +(((cramerX*d)-(b*cramerY))/((a*d)-(b*c)))
                    + "and y is " +(((a*cramerY)-(cramerX*c))/((a*d)-(b*c))));

        }
    }
}
