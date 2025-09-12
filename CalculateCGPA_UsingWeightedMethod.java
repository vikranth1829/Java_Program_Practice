package CodePractice;
import java.util.Scanner;
public class CalculateCGPA_UsingWeightedMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total no of Subjects : ");
		int n=sc.nextInt();
		double ind=0;
		double sum=0;
		double totcred=0;
		double cgpa=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter the Subject"+i+" Grade :");
			double g=sc.nextDouble();
			System.out.print("Enter the Subject"+i+" Credits :");
			double c=sc.nextDouble();
			ind=g*c;
			sum=sum+ind;
			totcred=totcred+c;
		}
			cgpa=sum/totcred;
			System.out.println("Your total CGPA is : "+cgpa);
			sc.close();
	}
}
