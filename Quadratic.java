
package arithmetic;
import java.lang.* ; 
import java.util . *;


public class Quadratic 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a , b , c ; 
        double r1  , r2 ; 
        double delta ; 
        
        System.out.println("Enter the 3 values : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
      
        delta = (b*b)- (4*a*c);
        System.out.println("The value of delta : " + delta );
        if (delta > 0 )
        {
          r1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
          r2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
           System.out.println("The roots are " + r1 + " " +r2);
        }
        else if (delta == 0 )
        {
            r1 = r2 = -b / (2*a);
            System.out.println("The roots are " + r1 + " " +r2);
        }
        else 
        {
            System.out.println("Roots are not real.");
        }
        
         
         
    }
}
