package CodePractice;

import java.util.Scanner;

public class ReverseNumber {
	
	// Using For Loop

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int rev=0;
		
		for( ; n!=0 ;n=n/10) 
		{
			int digit= n%10;
			rev=rev*10+digit;
		}
		System.out.println(rev);
		sc.close();
	}

}
