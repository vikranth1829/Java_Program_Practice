package CodePractice;
import java.util.Scanner;
public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value 'a' : ");
		int a=sc.nextInt();
		System.out.println("Enter value 'b' : ");
		int b=sc.nextInt();
	
		int gcd=a;
		int temp=b;
		
		while(temp!=0)
		{
			int rem=gcd%temp;
			gcd=temp;
			temp=rem;
		}
		int lcm=Math.abs(a*b)/gcd;
		System.out.println("LCM of "+a+","+b+" is : "+lcm);
		sc.close();
	}
}
