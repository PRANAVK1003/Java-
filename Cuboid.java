
package arithmetic;
import java .lang.*;
import java .util .* ;


public class Cuboid 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of cuboid : ");
         float length = sc.nextFloat();
         float breadth = sc.nextFloat();
         float height = sc.nextFloat();
        
         double area = 2 * ((length * height)+(length * breadth )+ (breadth*height));
         System.out.println("The area of Cuboid is : "+ area );
         
         double volume = length * breadth * height ; 
         System.out.println("Volume of the Cuboid is : "+ volume);
         
         
      
    }
    
    
}
