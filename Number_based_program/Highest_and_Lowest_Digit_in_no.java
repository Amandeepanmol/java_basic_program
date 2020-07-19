/* Eg: n=879
   Highest digit=9
   Lowest  digit=7
*/

Using while loop
------------------
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,max,min,rem=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        max=min=n%10;

        while(n!=0)
        {
            rem=n%10;
            
             if(max<rem)
               max=rem;
             if(min>rem)
               min=rem;
               
            n/=10;
        }
        
        System.out.println("Max digit is:"+max);
        System.out.println("Min digit is:"+min);
    }
}
--------------------------------------------------------------------------------------------------------------------
Using for loop
---------------
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,max,min,rem=0;                 
        n=sc.nextInt();
        max=min=n%10;

        for(n1=n;n1>0;n1/=10)
        {
             rem=n%10;
             if(max<rem)
               max=rem;
             if(min>rem)
               min=rem;
             n/=10;
        }
        System.out.println("Max digit is:"+max);
        System.out.println("Min digit is:"+min);
    }
}
