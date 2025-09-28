package AdvancedOopsProgram;
import java.util.Scanner;
public class PrimeBetweenTwoNumbers {
	
	public static void printprime(int fn,int ln)
	{
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
		if(b)
			System.out.println(b=n+" ");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int fn=sc.nextInt();
		System.out.print("Enter Last Number:");
		int ln=sc.nextIn;
		printprime(fn,ln);
		
		//printprime(fn,ln);
		sc.close();
		
	}

}
