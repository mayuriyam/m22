import java.io.*;
import java.util.*;
class palindrome
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        int sum=0;
        int tt;
        int temp=a;
        while(a>0)
        {
            tt=a%10;
            sum=(sum*10)+tt;
            a=a/10;
            
        }
        if(sum==temp)
        {
            System.out.println("palindrome");  
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}

