package AdvancedOopsProgram;
import java.util.Scanner;
public class Calculator {
	
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int subtract(int a, int b)
	{
		return a-b;
	}
	public static int multiply(int a, int b)
	{
		return a*b;
	}
	public static double divide(int a,int b)
	{
		return (double)a/b;
	}
	public static int modulo(int a, int b)
	{
		return a%b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int n2=sc.nextInt();
		System.out.println("Enter the Operator (+,-,*,/,%): ");
		char oprt=sc.next().charAt(0);
		
		if(oprt=='+')
		{
			int result=add(n1,n2);
			System.out.println(n1+"+"+n2+" = " +result);
		}
		else if(oprt=='-')
		{
			int result =subtract(n1,n2); 
			System.out.println(n1+"-"+n2+" = "+result);
		}
		else if(oprt=='*')
		{
			int result=multiply(n1,n2);
			System.out.println(n1+"*"+n2+" = "+result);
		}
		else if(oprt=='/')
		{
			if(n2!=0)
			{
				double result=divide(n1,n2);
				System.out.println(n1+"/"+n2+" = "+result);
			}
			else
			{
				System.out.println("Division by Zero is not allowed");
			}
		}
		else if(oprt=='%')
		{
			if(n2!=0) {
			int result =modulo(n1,n2);
			System.out.println(n1+"%"+n2+" = "+result);
			}
			else {
				System.out.println("Modulo by Zero is not allowed");
			}
		}
		else {
			System.out.println("Invalid Operator! : Enter (+,-,*,/,%)");
		}
			sc.close();
	}
}
