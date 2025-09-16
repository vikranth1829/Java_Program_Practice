package AdvancedOopsProgram;
import java.util.Scanner;
public class InrToUsd {
	
	public static double usd(int a)
	{
		double usd=a/87.98;
		return usd;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Inr Value :");
		int inr=sc.nextInt();
		System.out.println("Your Usd Value = "+usd(inr));
		sc.close();
	}
}
