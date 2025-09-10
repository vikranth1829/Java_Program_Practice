package CodePractice;

import java.util.Scanner;

public class FactorialOfNum_UsingRecursion {

	public int factorialmethod(int a)
	{
		int fact;
		if(a==0||a==1)
			return 1;
		else 
			fact=a*factorialmethod(a-1);
			return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Factorial No:");
		FactorialOfNum_UsingRecursion fr=new FactorialOfNum_UsingRecursion();
		int f=sc.nextInt();
		int result=fr.factorialmethod(f);
		System.out.println(f+"! is :"+result);
		sc.close();
	}
}