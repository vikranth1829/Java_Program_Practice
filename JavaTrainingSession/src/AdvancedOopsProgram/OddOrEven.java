package AdvancedOopsProgram;
import java.util.Scanner;
public class OddOrEven {
	
	public static void OddOrEven(int a)
	{
		if(a%2==0)
			System.out.print("Even");
		else 
			System.out.println("Odd");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n=sc.nextInt();
		OddOrEven(n);
		sc.close();	
	}
}
