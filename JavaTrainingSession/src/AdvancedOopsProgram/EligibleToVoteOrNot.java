package AdvancedOopsProgram;
import java.util.Scanner;
public class EligibleToVoteOrNot {
	public static boolean checkeligible(int a)
	{
		return a>=18;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age :");
		int age=sc.nextInt();

		if(checkeligible(age))
			System.out.println("Eligible to Vote !");
		else 
			System.out.println("Not eligible to Vote");
	}

}
