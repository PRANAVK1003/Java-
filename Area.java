
package arithmetic;
import java .lang.* ; 
import java.util.* ;

public class Area
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      //formula1
     /* System.out.println("Enter the Breadth of Triangle");
      float breadth = sc.nextFloat();
      System.out.println("Enter the height of Triangle");
      float height = sc.nextFloat() ;
      
      float area = (0.5f )*(breadth * height);
      System.out.println("The Area of Triangle is : " + area);*/
      
      //formula 2 
      float a , b ,c ,s ;
      double area2 ; 
      System.out.println("Enter the 3 sides of a triangle: ");
      a = sc.nextFloat();
      b = sc.nextFloat();
      c = sc.nextFloat();
      
      s = (0.5f)*(a+b+c);
      System.out.println("Value of s : "+ s);
      
      
      area2 = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
      System.out.println("The Area of Triangle is : "+ area2);
      
      
      
      
      
      
    
       
    }
}
