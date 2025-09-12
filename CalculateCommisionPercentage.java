package CodePractice;
import java.util.Scanner;
public class CalculateCommisionPercentage {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the sales value: ");
		double sales=sc.nextDouble();
		System.out.print("Enter the commision % : ");
		double perct=sc.nextDouble();
		double com=(sales*perct)/100;
		if(perct==0)
			System.out.println("No Commision!");
		else 
			System.out.printf("Your commision is : %.2f",com);
		}

}
