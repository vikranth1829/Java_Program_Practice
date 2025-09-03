package CodePractice;
import java.util.Scanner;
public class InrToUsd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INR value :");
		int inr=sc.nextInt();
		float usd=88.05f;
		
		System.out.println("Your USD value is : "+(inr/usd));
		sc.close();
	}

}
