package CodePractice;

import java.util.Scanner;

public class CountingOccurance {

	public static void main(String[] args) {		
		
								// 1. Method of converting int to String 
//		Scanner sc=new Scanner(System.in);
//	    int n=nextInt();	
//		String s= String.valueOf(n);
//		
//		int count =0;
//		
//		for(int i=0 ; i<s.length() ; i++) 
//		{
//			if(s.charAt(i)=='7')
//			count++;
//		}
//		System.out.println(count);
//		sc.close();
								// 2. Method of using division and remainder with for loop
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int count=0;
//		int rem=0;
//		for (;n!=0;n=n/10 )
//		{
//			int digit=n%10;
//			if (digit==7)
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//		sc.close();
	
								// 3. Method of using division and remainder with while loop
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
		int count=0;
		
		while (n!=0)
		{
			int rem=n%10;
			if(rem==7)
			{
				count++;
			}
			n=n/10;
		}
		
		System.out.println(count);
		
	}

}
