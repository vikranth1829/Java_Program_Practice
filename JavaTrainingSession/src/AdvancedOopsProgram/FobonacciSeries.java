package AdvancedOopsProgram;

import java.util.Scanner;

public class FobonacciSeries {

	public static void fibonacci(int n)
	{
		int n1=0;
		int n2=1;
		if(n==0)
		{
			System.out.println("No Term to print");
		}
		else if(n==1)
		{
			System.out.println('0');
		}
		else 
		{
			System.out.print(n1+" "+n2);
			for(int i=3;i<=n;i++)
			{
				int n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the nth Term :");
		int n=sc.nextInt();
		fibonacci(n);
		sc.close();
	}

}
