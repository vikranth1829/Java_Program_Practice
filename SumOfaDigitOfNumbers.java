package CodePractice;
import java.util.Scanner;
public class SumOfaDigitOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int n=sc.nextInt();
		int sum=0;
		for(;n!=0;n=n/10)
		{
			int digit=n%10;
			sum=sum+digit;
		}
		System.out.println("Sum of all digits : "+sum);
	}

}
