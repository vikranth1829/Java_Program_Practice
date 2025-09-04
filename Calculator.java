package CodePractice;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		int n1 , n2;
		int ans=0;
		System.out.println("Enter the Operator :");
		char s=sc.next().trim().charAt(0);
		if (s=='+'||s=='-'||s=='*'||s=='/'||s=='%')
		{
		  System.out.println("Enter the 1st Number :");
		  n1=sc.nextInt();
		  System.out.println("ENter the 2nd Number : ");
		  n2=sc.nextInt();
		
		  if(s=='+')
		  {
			ans=n1+n2;
		  }
		  if(s=='-')
		  {
			ans=n1-n2;
		  }
		  if(s=='*')
		  {
			ans=n1*n2;
		  }
		  if(s=='%')
		  {
			  ans=n1%n1;
		  }
		  if(s=='/')
		  {
			if(n2!=0)
				{
				ans=n1/n2;
				}
			else 
			{
				System.out.println("Division Zero not Allowed");
			}
		  }
		}
		else if(s=='X' || s=='x')
		{ 
			break;
		}
		else 
		{
			 System.out.println("Invalid Operation");
		}		
		System.out.println("Answer is : "+ans);
		
		}
	}
}
	


