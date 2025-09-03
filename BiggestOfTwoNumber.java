package CodePractice;
import java.util.Scanner;
public class BiggestOfTwoNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int n2=sc.nextInt();
		
		if(n1>n2)
			System.out.println(n1+" is Largest Number");
		else if(n2>n1)
			System.out.println(n2+" is Largest Number");	
		else
			System.out.println("Both Are Equal");
		
	}

}
