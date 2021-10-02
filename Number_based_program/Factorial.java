/* Factorial Eg: 5!=5*4*3*2*1  */

import java.util.*;
import java.io.*;

class Main 
{
    public static void main(String[] args)
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n,i,fact=0;
       n = Integer.parseInt(br.readLine()); // Fast IO
       
       for(i=n-1;i>1;i--)
       {
           n=n*i;
       }
       
       System.out.println("Factorial is:"+n);
    }
}

