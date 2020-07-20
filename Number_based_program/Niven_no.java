/* Niven Number:It is a number that is divisible by the sum of its digits.
Eg: n=18 
    sum=1+8=9
    18%9 is 0
*/

Using while loop
------------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n,rem,copy,sum=0;
       n=sc.nextInt();
       copy=n;
       
       while(n!=0)
       {
           rem=n%10;
           sum+=rem;
           n/=10;
       }
       
       if(copy%sum==0)
       {
           System.out.println("Niven number");
       }
       else
       {
           System.out.println("Not Niven number");
       }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------
Using foor loop
------------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,rem,sum=0;
        n=sc.nextInt();
        
        for(n1=n;n1>0;n1/=10)
        {
            rem=n1%10;
            sum=sum+rem;
        }
        
        if(n%sum==0)
        {
            System.out.println("Niven no");
        }
        else
        {
            System.out.println("Not Niven no");
        }
    }
}
