package CodePractice;
import java.util.Scanner;
public class CalculateEB_Bill {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Entered your Total Units consumed :");
		double unit=sc.nextDouble();
		double fees=0;
		if(unit<0)
		{
			System.out.println("Enter the valid Unit!");
		}
		else if(unit<=150)
		{
			System.out.println("Your Minimum Fees: Rupees : 150");
		}
		else if(unit<=400)
		{
			fees=unit*4.95;
			System.out.printf("Your Electricy Bills : %.2f",fees);
		}
		else if(unit<=500)
		{
			fees=unit*6.65;
			System.out.printf("Your Electricy Bills : %.2f",fees);
		}
		else if(unit<=600)
		{
			fees=unit*8.80;
			System.out.printf("Your Electricy Bills : %.2f",fees);
		}
		else if(unit<=800)
		{
			fees=unit*9.95;
			System.out.printf("Your Electricy Bills : %.2f",fees);
		}
		else 
		{
			fees=unit*11.05;
			System.out.printf("Your Electricy Bills : %.2f",fees);
		}
		sc.close();
	}

}
