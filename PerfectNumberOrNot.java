package CodePractice;
import java.util.Scanner;
public class PerfectNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number :");
		int n=sc.nextInt();
		int sum=0;
		int org=n;
		for (int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(org==sum&&org!=0)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
}
}