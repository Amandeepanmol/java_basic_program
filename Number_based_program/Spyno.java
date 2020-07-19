/* A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Eg: n=22
    sum=2+2=4
    product=2*2=4
*/

Using while loop
------------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,product=1,rem;
        n=sc.nextInt();
        
        while(n!=0)
        {
            rem=n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        
        if(sum==product)
        {
            System.out.println("Spy  number");
        }
        else
        {
            System.out.println("Not Spy number");
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------
Using for loop
---------------

import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,sum=0,product=1,rem;
        n=sc.nextInt();
        n1=n;
        
        for(n1=n;n1>0;n1/=10)
        {
            rem=n1%10;
            sum+=rem;
            product*=rem;
        }
        if(sum==product)
        {
            System.out.println("Spy  number");
        }
        else
        {
            System.out.println("Not Spy number");
        }
    }
}
