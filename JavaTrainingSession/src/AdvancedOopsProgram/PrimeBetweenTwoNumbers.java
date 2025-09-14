package AdvancedOopsProgram;
import java.util.Scanner;
public class PrimeBetweenTwoNumbers {
	
//	public static void printprime(int fn,int ln)
//	{
//		int count=0;
//			
//		for(int i=fn;i<=ln;i++)
//		{
//			if(fn%i==0)
//				System.out.println();
//		}
//		
//		
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int fn=sc.nextInt();
		System.out.print("Enter Last Number:");
		int ln=sc.nextInt();
		//printprime(fn,ln);
		boolean b=true;
		for (int n=fn;n<=ln;n++)
		{
			for(int i=2;i<=n;i++)
			{
				if(n%i==0)
					b=false;
				    break;
			}
			
		}
		sc.close();
		
	}

}
