package CodePractice;
import java.util.Scanner;
public class AverageOfN_Numbers {

	public static void main(String[] args) {
		System.out.print("Enter how many numbers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter No "+i+" :");
			double temp=sc.nextDouble();
			sum=temp+sum;
		}
		double avg=sum/n;
		System.out.printf("Your Average of No's :%.2f",avg);
		sc.close();
	}
}
