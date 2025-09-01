package CodePractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		//1. Simple  For Loop Method
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		if(n<=0)
//		{
//			System.out.println("No Term to print");
//		}
//		else if(n==1)
//		{
//			System.out.println("0");
//		}
//		else 
//		{
//			int n1=0;
//			int n2=1;
//			System.out.print(n1+"  "+n2);
//			for (int i=3;i<=n;i++)
//			{
//				int n3=n1+n2;
//				System.out.print("  "+n3);
//				n1=n2;
//				n2=n3;
//			}
//			System.out.println();
//		}
		
			//2. simple Swap method when n is know like Print 10 Fibnocci Series
		
//		int n=10;
//		int n1=0;
//		int n2=1;
//		System.out.print(n1+" "+n2);
//		for (int i=1;i<=n;i++)
//		{
//			int n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
//		
			 
			//3. Use WHile Loop
		
		int n=10;
		int n1=0,n2=1;
		System.out.print(n1+" "+n2);
		int i=2;
		while (i<n)
		{
			
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
	
			
	}

}
