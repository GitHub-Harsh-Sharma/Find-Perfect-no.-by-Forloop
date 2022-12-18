import java.io.*;
import java.util.Scanner;
class Perfectforloop
{
    public static void main(String arr[])
    {
        int i,sum=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Perfect no.:");
        num=sc.nextInt();
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(num==sum)
        System.out.print(":Prefect Number");
        else
        System.out.print(":Not a perfect number");
    }
}