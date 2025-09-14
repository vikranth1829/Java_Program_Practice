package AdvancedOopsProgram;
import java.util.Scanner;
public class MaxMinMethodFromThreeNos {
	static int result;
	
	public static int max(int a, int b, int c)
	{
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}
	
	public static int min(int a, int b, int c)
	{
		int min=a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int a=sc.nextInt();
		System.out.print("Enter number 2 : ");
		int b=sc.nextInt();
		System.out.print("Enter number 3 : ");
		int c=sc.nextInt();
		
		int mxres=max(a, b, c);
		int mnres=min(a, b, c);
		System.out.println("Max value is : "+mxres);
		System.out.println("Min value is : "+mnres);
		sc.close();
	}

}
