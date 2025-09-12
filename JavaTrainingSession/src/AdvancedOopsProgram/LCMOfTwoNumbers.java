package AdvancedOopsProgram;
import java.util.Scanner;
public class LCMOfTwoNumbers {

	public static int gcd(int a,int b)
	{
		int gcd=Math.abs(a);
		int temp=Math.abs(b);
		while(temp!=0)
		{
			int rem=gcd%temp;
			gcd=temp;
			temp=rem;
		}
		return gcd;
	}
	
	public static int lcm(int a,int b)
	{
		int temp=Math.abs(a)*Math.abs(b);
		int lcm=temp/LCMOfTwoNumbers.gcd(a, b);
		return lcm;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value a : ");
		int a=sc.nextInt();
		System.out.print("Enter value b : ");
		int b=sc.nextInt();
		int result=lcm(a,b);
		System.out.print("LCM of "+a+","+b+" is :"+result);
		sc.close();
		
	}

}
