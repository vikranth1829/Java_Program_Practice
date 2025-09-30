package CodePractice;
import java.util.Scanner;
public class Number_is_PalindromOrNot {

	public static void main(String[] args) {
		
						//StringBuilder method

//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter any number :");
//		int n=sc.nextInt();
//		String str=Integer.toString(n);
//		StringBuilder sb=new StringBuilder(str);
//		String rev=sb.reverse().toString();
//		if(str.equals(rev))
//			System.out.println("Palindrom");
//		else
//			System.out.println("Not Palindrom");
		
					//For Loop mathamatic straight method
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter any Number : ");
//		int n=sc.nextInt();
//		int rev=0;
//		int org=n;
//		for(;n!=0;n=n/10)
//		{
//			int rem=n%10;
//			rev=rev*10+rem;
//		}
//		if(rev==org)
//			System.out.println("Palindrom");
//		else
//			System.out.println("Not Palindrom");
//		sc.close();

				// Two Pointer Approach

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number :");
		int n=sc.nextInt();
		String s=Integer.toString(n);
		boolean b=true;
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				b=false;
		}
		if(b)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
	}

}
