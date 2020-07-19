/*
Prime Number=>The number which is only divisible by itself and 1 is known as prime number, 
for example 5 is a prime number because it is only divisible by itself and 1.
*/

import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;                 
        int i;
        int c=0;
        n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Prime");
        }
        else 
        {
            System.out.println("Not prime");
        }
        
    }
}
