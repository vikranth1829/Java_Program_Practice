package CodePractice;
import java.util.Scanner;
public class ArithmeticOpreationBasic {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n1,n2;
		double result;
		char op;
		System.out.println("Enter any Operator (+,-,*,/) :" );
		op=sc.next().charAt(0);
		System.out.println("Enter 1st Number");
		n1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		n2=sc.nextInt();
		if(op=='+')
		 	{
			result=n1+n2;
			System.out.println("Answer is :"+result);
		 	}
			else if(op=='-')
			{
			result=n1-n2;
			System.out.println("Answer is :"+result);
			}
			else if(op=='*')
			{
			result=n1*n2;
			System.out.println("Answer is :"+result);
			}
			else if(op=='/')
				{
				if(n2!=0)
				{
				result=(double)n1/n2;
				System.out.println("Answer is :"+result);
				}
				else 
				{
				System.out.println("Zero cannot be divide");
				}
		}
		else 
		{
		System.out.println("Invalid Operator : Enter (+,-,*,/)");
		}
		
		sc.close();
			
		}
	}


