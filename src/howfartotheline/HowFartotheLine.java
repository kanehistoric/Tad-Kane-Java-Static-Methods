
package howfartotheline;
import java.util.*;
import static java.lang.System.out; //import so you can shorten System.out.println to just out.println
/**
 *
 * @author rkane
 */
public class HowFartotheLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        out.println("This program takes in the coordinates of a point, and the"
                + "coefficients of \nthe equation Ax + By + C = 0, and computes the "
                + "distance from the point to the line.\n");
        
        Scanner input = new Scanner(System.in);
        
        out.print("Enter the A value for the line: ");
        DistToLine.A = input.nextDouble();
        out.print("Enter the B value for the line: ");
        DistToLine.B = input.nextDouble();
        out.print("Enter the C value for the line: ");
        DistToLine.C = input.nextDouble();
        
        out.print("Enter the x coordinate of the point: ");
        double x = input.nextDouble();
        out.print("Enter the y coordinate of the point: ");
        double y = input.nextDouble();
        
        // Calling static method from DistToLine class without having to use an object.
        out.printf("Distance from the point to the line is: %.2f \n", DistToLine.getDist(x, y));
        
        // Making an object and using it to call the .getDist() method.
        DistToLine calcObj = new DistToLine();
        
        out.println("Distance from the point to the line using an object: " + calcObj.getDist(x,y));
        
        
    }
    
    public static double calcMe(double x, double y, double z)
    {
        
        return 23.4;
    }
    
}
