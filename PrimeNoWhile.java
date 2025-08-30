package CodePractice;

import java.util.Scanner;

public class PrimeNoWhile {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int c=2;
		int count =0;
		
		if(n<2) //check its lesser than 1 and print not prime nor Composite
		{
			System.out.println("Neither Prime nor Cpmposite");
			sc.close();
			return;
		}
	  while (c<n) 
		{
			if(n%c==0)
			{
				count++;
				break;
			}
			c++;		
		}
		
		if (count==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
		
		sc.close();
		
	}
}
