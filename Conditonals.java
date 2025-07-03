package conditonals;
import java .util.*;


public class Conditonals 
{
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       if(a<b && a<c)
       {
           System.out.print("a is the smallest");
           
       }
       else if (b<c )
       {
           System.out.println("b is the smallest");
       }
       else
       {
           System.out.println("c is the smallest");
       }
       
    
   
       int n = 5 ; 
       
      if(n>=0)
      {
           System.out.println("Positive");
          
      }
      else 
      {
          System.out.println("Negative");
          
      }
       
       
    }
}
