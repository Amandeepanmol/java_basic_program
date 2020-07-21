/* Handsome number is the one in which the sum of all the digits from left side to the secondlast digit equals the last one.
For example 123 : 1+2=3
            145 : 1+4=5
*/

Using while loop
-----------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,copy,sum=0;
        n=sc.nextInt();
        copy=n/10;
        while(copy!=0)
        {
            rem=copy%10;
            sum+=rem;
            copy/=10;
        }
        
        if(n%10==sum)
        {
            System.out.println("Handsome no");
        }
        else
        {
            System.out.println("Not Handsome no");
        }
    }
}
--------------------------------------------------------------------------------------------------------------------------------------
Using for loop
----------------
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,rem,sum=0;
        n=sc.nextInt();
        
        for(n1=n/10;n1>0;n1/=10)
        {
            rem=n1%10;
            sum+=rem;
        }
        
        if(n%10==sum)
        {
            System.out.println("Handsome no");
        }
        else
        {
            System.out.println("Not Handsome no");
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------------
