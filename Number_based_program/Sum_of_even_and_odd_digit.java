/* Eg: n=123
       Sum of even digit=4
       Sum of odd digit=3       
*/

Using while loop
-------------------

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sumeven=0,sumodd=0,rem;                 
        n=sc.nextInt();
        
        while(n!=0)
        {
            rem=n%10;
            if(rem%2==0)
                sumeven+=rem;
            else
                sumodd+=rem;
            n/=10;
        }
        
        System.out.println("Sum of even digit "+sumeven);
        System.out.println("Sum of odd digit "+sumodd);   
        
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------
Using for lopp
---------------
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,sumeven=0,sumodd=0,rem;                 
        n=sc.nextInt();
        
        
        for(n1=n;n1>0;n1/=10)
        {
            rem=n1%10;
            
            if(rem%2==0)
              sumeven+=rem;
            else
              sumodd+=rem;
        }
        
        System.out.println("Sum of even digit "+sumeven);
        System.out.println("Sum of odd digit "+sumodd);  
    }
}
