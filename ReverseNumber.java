package CodePractice;

import java.util.Scanner;

public class ReverseNumber {
	
		public static void main(String[] args) {
		
											// 1. Using For Loop
			
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int rev=0;
//		
//		for( ; n!=0 ;n=n/10) 
//		{
//			int digit= n%10;
//			rev=rev*10+digit;
//		}
//		System.out.println(rev);
//		sc.close();
		
											// 2. Using While Loop							
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int rev=0;
		int digit=0;
		
		while(n!=0)
		{
		
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("Your reverse no :"+ rev);
		sc.close();
		}

}
