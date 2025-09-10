package CodePractice;
import java.util.Scanner;
public class CalculateAverageMarks {

	public static void main(String[] args) {
		
									//Normal operation with For loop
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the number of Subjects :");	
//		int n=sc.nextInt();
//		int sum=0;
//		double avg=0;
//		for(int i=1;i<=n;i++)
//		{
//			System.out.print("Enter Subject "+i+" mark :");
//			int mark=sc.nextInt();
//			sum+=mark;
//		}
//		avg=(double)sum/n;
//		System.out.println("Everage of marks : "+avg);
//		sc.close();
	
								  // Array with For loop
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] marks=new int[n];
		
		for (int i=0;i<=n;i++)
		{
			marks[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum+=marks[i];
		}
		double avg=(double)sum/n;
		System.out.println("Your Average : "+avg);
		sc.close();
		
	
	}
}
