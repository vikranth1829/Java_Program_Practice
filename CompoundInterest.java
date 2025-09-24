package CodePractice;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Principal Amount : ");
		int p=sc.nextInt();
		
		System.out.print("Enter Rate of Interest : ");
		double r=sc.nextDouble();
		
		System.out.print("Enter the Duration of Loan : ");
		double t=sc.nextDouble();
		
		System.out.print("Enter duration of Compound : ");
		int n=sc.nextInt();
				
		double a=p*Math.pow((1+(r/(100*n))),n*t);
		
		double ci=a-p;
		
		System.out.printf("Compound Interest : %.2f",ci);
		sc.close();
		
	}

}
