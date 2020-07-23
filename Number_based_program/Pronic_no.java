/* Pronic no:A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
Eg:12=3*4
   20=4*5
   6=2*3

import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        boolean flag=false;
        
        n=sc.nextInt();
        
        for(i=1;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("Pronic no");
        }
        else
        {
            System.out.println("Not Pronic no");
        }
    }
}
