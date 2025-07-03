package arithmetic ; 
public class Bitwise
{
    public static void main(String args[])
    {
        int x =10;
        int y;
        y=~x ; 
        System.out.println(String.format("%s", Integer.toBinaryString(x)));
        System.out.println(String.format("%32s", Integer.toBinaryString(y)));
        System.out.println(y);
        
        //Swapping the variables using XOR Operation 
        int a = 10 , b = 15 ; 
        
       a = a ^ b ;
       b = a ^ b ; 
       a = a ^ b ; 
       System.out.println(a + " " + b );
       
       byte c = 9 , d = 12 ; 
       byte e ; 
       
       e = (byte)(c<<4) ; 
       e  = (byte)(e | d) ; 
       System.out.print((e&0b11110000)>>4);
       
       
       
    }
    
}
