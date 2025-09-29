package AdvancedOopsProgram;

import java.util.Scanner;

public class LargestNo {
	
	public void max(int a, int b)
	{
		if(a>b)
			System.out.println(a+" is Largest No");
		if(b>a)
			System.out.println(b+" is Largest No");
		else
			System.out.println("Both are equal");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LargestNo obj=new LargestNo();
		System.out.print("Enter 1st Number : ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		int b=sc.nextInt();
		obj.max(a, b);
		sc.close();
	}

}
