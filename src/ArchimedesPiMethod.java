import java.util.Scanner;
import java.lang.Math;

/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 */

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("Please enter the number of sides:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int enter;
        if (n<1){
            enter = 1;
        }
        else{
            enter = 2;
        }
       switch (enter){
           case 1:
               System.out.println("Please try again with a positive number of sides");
               break;
           case 2:
               double b = 360.0/n;
               double a = Math.toRadians(b/2.0);
               double angle = Math.sin(a);
               double side = 2 * angle;
               double perimeter = n * side;
               double pi = perimeter/2;

               System.out.printf("The estimate for pi based on a %d sided polygon is %.15f", n , pi);
               break;
       }

    }
}
