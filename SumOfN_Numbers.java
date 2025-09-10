package CodePractice;
import java.util.Scanner;
public class SumOfN_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the numbers nth term :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Your Sum of "+n+" is : "+sum);

		
//		while(i<=n)
//		{
//			sum+=i;
//			i++;
//		}
	
	}
}
