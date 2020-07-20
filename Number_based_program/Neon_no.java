/* A number is called as  Neon number if sum of digits of the square of the number is equal to the  number.
Eg:Number to check : 9  
Square of a given number : 9 * 9 = 81
Sum of digits of square number : 8 + 1 = 9            // 9 is a Neon number
*/

Using while-loop
--------------------

import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,square,rem,sum=0;
        
        n=sc.nextInt();
        square=n*n;
        
        while(square!=0)
        {
            rem=square%10;
            sum+=rem;
            square/=10;
        }
        
        if(n==sum)
        {
            System.out.println("Neon no");
        }
        else 
        {
            System.out.println("Not Neon no");
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------
Using for loop
---------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,square,rem,sum=0;
        
        n=sc.nextInt();
        
        for(n1=n*n;n1>0;n1/=10)
        {
            rem=n1%10;
            sum+=rem;
        }
        if(n==sum)
        {
            System.out.println("Neon no");
        }
        else 
        {
            System.out.println("Not Neon no");
        }
    }
}

