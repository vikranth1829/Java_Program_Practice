package AdvancedOopsProgram;
import java.util.Scanner;
public class ProductOfTwoNumbers {
	
	public static int product(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st value : ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd value : ");
		int b=sc.nextInt();
		System.out.print("Your Product is : "+product(a,b));
		sc.close();
	}
}
