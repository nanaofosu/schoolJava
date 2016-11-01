/*(Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year.*/

public class  Chapter5_7 {
   public static void main(String[] args) {
    double tuition, increase;
    tuition = 10000; increase = 0.05;
    int x=1;

    do{
      tuition = tuition +(tuition*increase);
      x++;
    }
    while(x<10);



    System.out.println("The tuition after 10 years is: " + tuition);
    while(x<15){
      tuition = tuition+(tuition +(tuition*increase));
      x++;
    }
    System.out.println("The total cost of four years' worth of tuition after the tenth year: " + tuition);


  }
}
