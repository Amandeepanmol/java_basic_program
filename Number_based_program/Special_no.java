/*A number is known as Special number when sum of the factorial of digits is equal to the original number (given number).
Eg: n=145 =1!+4!+5!=145
*/

Using while-loop
---------------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,i,n1,sum=0;
        n=sc.nextInt();
        n1=n;
        
        while(n1!=0)
        {
            rem=n1%10;
            for(i=rem-1;i>1;i--)
            {
                rem*=i;
            }
            sum+=rem;
            n1/=10;
        }
        
        if(sum==n)
        {
            System.out.println("Special Number");
        }
        else 
        {
            System.out.println("Not Special Number");
        }
    }
}
------------------------------------------------------------------------------------------------------------------------------------

Using for-loop
------------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,i,n1,sum=0;
        n=sc.nextInt();
       
        for(n1=n;n1>0;n1/=10)
        {
            rem=n1%10;
            for(i=rem-1;i>1;i--)
            {
                rem*=i;
            }
            sum+=rem;
        }
        
        if(sum==n)
        {
            System.out.println("Special Number");
        }
        else 
        {
            System.out.println("Not Special Number");
        }
    }
}
