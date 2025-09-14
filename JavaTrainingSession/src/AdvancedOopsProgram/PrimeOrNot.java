package AdvancedOopsProgram;
import java.util.Scanner;
public class PrimeOrNot {
	
	public static boolean prime(int n) {
	
		if(n<=1)
		{
			return false;
		}
			for (int i=2;i<Math.sqrt(n);i++)
			{
				if(n%i==0)
					return false;
			}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=sc.nextInt();
		boolean b=prime(n);
		if(b)									//System.out.println(b? "Prime Number" : "Not a Prime Number");						
			System.out.println("Prime No");
		else 
			System.out.println("Not a Prime No");
		sc.close();
	}
}
