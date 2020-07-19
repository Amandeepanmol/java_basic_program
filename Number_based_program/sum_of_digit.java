/* Eg: Enter no=123
       Sum of digit=6
*/
Using while-loop
------------------


import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,rem;                 
        n=sc.nextInt();
        
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n/=10;
        }
        System.out.println("Sum of digit is :"+sum);
        
    }
}
-------------------------------------------------------------------------------------------------------------------------------
Using for loop
---------------

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,sum=0,rem;                 
        n=sc.nextInt();
        
        for(n1=n;n1>0;n1/=10)
        {
            rem=n1%10;
            sum+=rem;
        }
        System.out.println("Sum of number is :"+sum);
        
    }
}
