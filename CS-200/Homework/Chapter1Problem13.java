
/*
    This is my first java app
*/


public  class Chapter1Problem13{
    public static void main(String[] args) {
        
                
        System.out.println ("Given the following 2 x 2 system of equations,");
        System.out.println ("3.4x + 50.2y = 44.5");
        System.out.println ("2.1x + .55y = 5.9");
        System.out.println ("We will use Cramers rule to quickly compute the values of x and y");
        
        double x = ((44.5*0.55)-(50.2*5.9))/((3.4*0.55)-(50.2*2.1));
            
        double y = ((3.4*5.9)-(44.5*2.1))/((3.4*0.55)-(50.2*2.1));
            
        System.out.println ("The value for x is: " + x);
        System.out.println ("The value for y is: " + y);
        
        
        
    }
}
