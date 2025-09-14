package AdvancedOopsProgram;
import java.util.Scanner;
public class SumOfN_NaturalNumbers {
	
	public static int natural(int n)
	{	int sum=0;
		for (int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		int sum =natural(n);
		System.out.print("Sum = "+sum);
		sc.close();
	}

}
