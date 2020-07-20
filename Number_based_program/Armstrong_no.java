/*Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of its digits
Eg: 0, 1, 153.
n=153
  (1*1*1)+(5*5*5)+(3*3*3)=153
*/

Using while loop
------------------

import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n,rem,sum=0,copy;
       n=sc.nextInt();
       copy=n;
       
       while(n!=0)
       {
           rem=n%10;
           sum+=Math.pow(rem,3);
           n/=10;
       }
       
       if(sum==copy)
       {
           System.out.println("Armstrong no");
       }
       else
       {
           System.out.println("Not Armstrong no");
       }
    }
}
------------------------------------------------------------------------------------------------------------------
Using for loop
---------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,copy,square,rem,sum=0;
        
        n=sc.nextInt();
        copy=n;
        
        for(n1=n;n1>0;n1/=10)
        {
            rem=n1%10;
            sum+=Math.pow(rem,3);
        }
        
        if(sum==copy)
        {
           System.out.println("Armstrong no");
        }
        else
        {
           System.out.println("Not Armstrong no");
        }
    }
}
