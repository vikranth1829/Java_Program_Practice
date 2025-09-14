package AdvancedOopsProgram;
import java.util.Scanner;
public class FactorialMethod {
	
	public static int factorial(int n)
	{
		int fact=1;
		if(n!=0)
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the factorial No :");
		int n=sc.nextInt();
		if(n<0)
			System.out.println("No Terms for Negative values.");
		else {
			int result=factorial(n);
			System.out.println(n+"! ="+result);
		}
		
		sc.close();
	}

}
