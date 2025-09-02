package CodePractice;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
						
						//Simple Interest for Year
		
//		System.out.println("Enter the Principal amount");
//		int p=sc.nextInt();
//		System.out.println("Enter time (in Year)");
//		int t=sc.nextInt();
//		System.out.println("Enter Rate of Interest");
//		float r=sc.nextFloat();
//		
//		float si=(p*t*r)/100;
//		System.out.println("Your Simple Interest is : "+si);
//		sc.close();
		
						// Simple Interest for Months
		System.out.println("Enter the Principal amount");
		int p=sc.nextInt();
		System.out.println("Enter time (in months)");
		int t=sc.nextInt();
		System.out.println("Enter Rate of Interest");
		float r=sc.nextFloat();
		
		
		float si=(p*t*(r/12))/100;                               //t/12 will convert the years to months
		System.out.println("Your Simple Interest is : "+si);
		sc.close();
	
	}

}
