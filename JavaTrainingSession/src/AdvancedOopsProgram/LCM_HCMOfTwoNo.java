package AdvancedOopsProgram;
import java.util.Scanner;
public class LCM_HCMOfTwoNo {
	
	public static int hcf(int a,int b)
	{
		int rem;
		while(b!=0)
		{
			rem=a%b;
			a=b;
			b=rem;
		}
		return a;
	}
	public static int lcm(int a,int b,int gcd)
	{
		int result =(a*b)/gcd;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		int b=sc.nextInt();
		int gcd=hcf(a,b);
		int finalresult=lcm(a,b,gcd);
		System.out.println("GCD/HCM = "+gcd);
		System.out.println("LCM = "+finalresult);
		sc.close();
	}

}
