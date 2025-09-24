package CodePractice;

import java.util.Scanner;

public class MaxThreeNo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
							//  Using temp value
		
//		int max=a;
//		if(b>max)
//		{
//			max=b;
//		}
//		if(c>max)
//		{
//			max=c;
//		}
//		System.out.println(max);
//		
//		sc.close();
		
								//Using operators
//		if ((a>=b)&&(a>=c))
//		{
//			System.out.println(a);
//			
//		}else if((b>=a)&&(b>=c))
//			System.out.println(b);
//		else
//			System.out.println(c);
//		sc.close();
		
								//Using default method
		
		int large = Math.max(a,Math.max(b, c));
		System.out.println(large);
				
	}
	}


