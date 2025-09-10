package CodePractice;
import java.util.Scanner;
public class CalculateCPGA_SimpleMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of Subjects : ");
		int n=sc.nextInt();
		double sum=0;
		for(int i =1;i<=n;i++)
		{
			System.out.print("Enter the "+i+"st Subject Grade: ");
			double grade=sc.nextDouble();
			sum=sum+grade;
		}
		double cgpa=sum/n;
		System.out.println("Your CGPA is : "+cgpa);
		sc.close();
	}
}
