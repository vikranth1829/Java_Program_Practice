package CodePractice;

import java.util.Scanner;

public class PrimeNo_While_For_CodeOptimization_MathSqrt {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		int count=0;
		n=sc.nextInt();
		
												//For Loop Code Optimization using Math.sqrt(n) method
		if (n<=1)
		{
			System.out.println("Nor Prime & Nor Composite Number");
			return;
		}
		
	/*	for(int i=2;i<=Math.sqrt(n);i++) //for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if (count==0)
			System.out.println("Prime Number");
		else 
			System.out.println("Not Prime Number");
		sc.close(); 
	*/
		
											//While Loop COde Optimization using Math.sqrt(n) method

		
		int c=2;
		while (c<=Math.sqrt(n))   //while(c*c<=n)
		{
			if(n%c==0)
			{
				count++;
				break;
			}
			c++;
		}
		if(count==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
		sc.close();
		
		
		
	}
}
