package CodePractice;
import java.util.Scanner;
public class HCFofTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value : ");
		int a=sc.nextInt();
		System.out.print("Enter b value : ");
		int b=sc.nextInt();
		
		a=Math.abs(a);
		b=Math.abs(b);
		
		while(b!=0)
		{
			
			int rem=a%b;
			a=b;
			b=rem;
		}
		System.out.print("HCF is : "+a);
		sc.close();
	}
}
