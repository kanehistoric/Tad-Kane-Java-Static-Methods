
package howfartotheline;
import static java.lang.Math.*;  //import so you can shorten Math.abs() to just abs


/**
 *
 * @author rkane
 */
public class DistToLine {
    
    public static double A, B, C;
    
    public static double getDist( double a, double b)   {
        double dist = (abs(A*a + B*b + C)/(sqrt(A*A + B*B)));
        return dist;
    }
}
