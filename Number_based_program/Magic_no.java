/*A number is said to be a Magic number if the sum of its digits are calculated till a single digit is obtained by recursively adding the sum of its digits.
If the single digit comes to be 1 then the number is a magic number. Eg: 19=1+9=10=1+0=1
*/

import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,sum=0;
        
        n=sc.nextInt();
        
        while(n!=0)
        {
            rem=n%10;
            sum+=rem;
            n/=10;
            
            if(n==0 && sum>9)
            {
                n=sum;
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

