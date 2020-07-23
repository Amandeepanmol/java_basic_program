/*A number is said to be a Magic number if the sum of its digits are calculated till a single digit is obtained by recursively adding the sum of its digits.
If the single digit comes to be 1 then the number is a magic number. Eg: 19=1+9=10=1+0=1
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
            sum+=rem;
            n1/=10;
            
            if(n1==0 && sum>9)
            {
                n1=sum;
                sum=0;
            }
        }
        if(sum==1)
        {
        System.out.println("Magic number");
        }
        else
        {
              System.out.println("Not Magic number");
        }
    }
}

