package CodePractice;
import java.util.Scanner;
public class SumOfNegativePositive_Even_OddNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int sumneg=0;
		int sumpstveven=0;
		int sumpstveodd=0;
		int n=0;
		System.out.println("Enter any numbers (0 to Stop) :");
		while(true)
		{
			
			
			if(!sc.hasNextInt())
			{
				System.out.println("Enter Valid Integers only");
				sc.next();
				continue;
			}
			
			n=sc.nextInt();
			if (n==0)
				break;
			if(n<0)
				sumneg+=n;
			else if(n%2==0)
				sumpstveven+=n;
			else 
				sumpstveodd+=n;		
		}
		System.out.println("Sum Negative : "+ sumneg);
		System.out.println("Sum Positive Even : "+sumpstveven);
		System.out.println("Sum Positive Odd : "+sumpstveodd);
		sc.close();	
	}
}
