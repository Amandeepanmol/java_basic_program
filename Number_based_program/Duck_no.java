import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,copy,rem,n1;
        boolean flag=false;
        n=sc.nextInt();
        copy=n;
        
        while(copy!=0)
        {
            rem=copy%10;
            if(rem==0)
            {
                flag=true;
                break;
            }
            copy/=10;
        }
        
        if(flag==true)
        {
            System.out.println("Duck Number");
        }
        else
        {
            System.out.println("Not Duck Number");
        }
    }
}
