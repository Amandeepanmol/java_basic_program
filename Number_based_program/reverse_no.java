/* Eg: Enter no:879
       Reverse is:978
*/

Using while-loop
------------------
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,rev=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println("Revevrse of number is :"+rev);
        
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------
  Using for loop
  ---------------
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,rem,rev=0;                 
        n=sc.nextInt();
        for(n1=n;n1>0;n1/=10)
        {
            rem=n1%10;;
            rev=rev*10+rem;
        }
        System.out.println("Revevrse of number is :"+rev);
        
    }
}
