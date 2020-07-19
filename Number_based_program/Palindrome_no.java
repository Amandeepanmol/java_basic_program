/* In number system a palindromic number is a number that is the same when written forwards or backwards, i.e. n=0,1,2,4,5,6,7,8,9,11,....989.......
*/

Using while loop
------------------
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,copy,rev=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        copy=n;
        
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        
        if(rev==copy)
        {
          System.out.println("Palindrome number");    
        }
        else
        {
        System.out.println("Not Palindrome number");
        }
    }
}
--------------------------------------------------------------------------------------------------------------------
Using for loop
--------------
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
        
        if(rev==n)
        {
            System.out.println("Palindrome number");    
        }
        else
        {
        System.out.println("Not Palindrome number");
        }
    }
}
