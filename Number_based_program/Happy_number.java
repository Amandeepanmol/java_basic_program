/* Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.
Eg: 7=7^2=49
    49=4^2+9^2=97
    97=9^2+9^7=130
    130=1^2+3^2+0^2=10
    10=1^2+0^2=1
    
    So 7 is Happy Number
*/

import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,rem,sum=0;
        
        n=sc.nextInt();
        n1=n;
        
        while(n1!=0)
        {
            rem=n1%10;
            sum+=(rem*rem);
            n1/=10;
            
            if(n1==0 && sum>9)
            {
                n1=sum;
                sum=0;
            }
        }
        
        if(sum==1)
        {
            System.out.println("Happy Number");
        }
        else
        {
               System.out.println("Not Happy Number");
        }
    }
}
