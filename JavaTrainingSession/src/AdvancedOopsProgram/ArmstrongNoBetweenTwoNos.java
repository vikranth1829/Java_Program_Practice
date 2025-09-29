package AdvancedOopsProgram;
import java.util.Scanner;
public class ArmstrongNoBetweenTwoNos {
	
	public static void armstrong(int fn,int ln)
	{
		for(int i=fn;i<=ln;i++)
		{
			int original=i;
			int sum=0;
			int rem=0;
			int temp=i;
			int count=0;
			while(temp!=0)
			{
				count++;
				temp=temp/10;
			}
			temp=i;
			for(;temp!=0;temp=temp/10)
			{
				rem=temp%10;
				sum=sum+(int)Math.pow(rem,count);
			}
			if(sum==original)
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First No : ");
		int a=sc.nextInt();
		System.out.print("Enter Last no : ");
		int b=sc.nextInt();
		armstrong(a,b);
		sc.close();
	}

}
