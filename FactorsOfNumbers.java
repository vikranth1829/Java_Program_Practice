package CodePractice;
import java.util.Scanner;
public class FactorsOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		
		while(true) 
		{
			if(sc.hasNextInt())
			{
				n=sc.nextInt();
				if(n>0)
					break;
				else
					System.out.print("Enter more than zero : Enter Integer :");
			}
			else 
			{
				System.out.println("Invalid input : Enter Integer value: ");
				sc.next();	
			}
		}
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i+" ");
		}
	}
}