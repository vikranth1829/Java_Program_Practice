package AdvancedOopsProgram;
import java.util.Scanner;
public class InterestCalculation {
	
	public double simpleint(Scanner sc)
	{
		System.out.print("Enter Principal Amount : ");
		int p=sc.nextInt();
		System.out.print("Enter Interest rate : ");
		double r=sc.nextDouble();
		System.out.print("Enter Duration of Loan : ");
		int n=sc.nextInt();
		double result=(double)(p*n*r)/100;
		return result;
	}
	public double compoundint(Scanner sc)
	{
		
		System.out.print("Enter Principal Amount : ");
		int p=sc.nextInt();
		System.out.print("Enter Interest rate : ");
		double r=sc.nextDouble();
		System.out.print("Enter Duration of loan (Years) : ");
		int n=sc.nextInt();
		System.out.println("Enter Compounded per year : ");
		int t=sc.nextInt();
		double totamount=(double)p*Math.pow((1+(r/(n*100))),(n*t));
		double ci=totamount-p;
		return ci;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InterestCalculation ic=new InterestCalculation();
		System.out.println("Select any one of the options :\n 1-Simple Interest \n 2-Compound Interest ");
		int opt=sc.nextInt();
		if(opt==1)
		{
			double result1=ic.simpleint(sc);
			System.out.print("Simple Interest : "+result1);
		}
		else if(opt==2)
		{
			double result2=ic.compoundint(sc);
			System.out.print("Compound Interest : "+result2);
		}
		else 
			System.out.println("Enter either 1 or 2");
		sc.close();	
	}
}