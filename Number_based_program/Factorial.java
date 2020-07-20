/* Factorial Eg: 5!=5*4*3*2*1  */

import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n,i,fact=0;
       n=sc.nextInt();
       
       for(i=n-1;i>1;i--)
       {
           n=n*i;
       }
       
       System.out.println("Factorial is:"+n);
    }
}

