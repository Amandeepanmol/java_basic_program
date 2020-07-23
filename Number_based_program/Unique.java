/*A Unique number is a positive integer (without leading zeros) with no duplicate digits
eg:89,789,987 etc....
*/


import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,i,c=0,rem;
        boolean flag=true;
        n=sc.nextInt();
        
        for(i=0;i<=9;i++)
        {
            c=0;
            for(n1=n;n1>0;n1/=10)
            {
                rem=n1%10;
                if(rem==i)
                c++;
            }
            if(c>1)
            {
                flag=false;
                break;
            }
        }
        
        if(flag==true)
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}
