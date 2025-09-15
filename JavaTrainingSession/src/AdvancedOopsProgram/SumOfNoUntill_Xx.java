package AdvancedOopsProgram;
import java.util.Scanner;
public class SumOfNoUntill_Xx {
	
	public static int sum(String a)
	{
		int n;
		int sum=0;
		while(true)
		{
			if(a.equalsIgnoreCase("x"))
			{
				return sum;
			}	
			try{
				n=Integer.parseInt(a);
				sum=sum+n;
			}catch(NumberFormatException e)
				{
					System.out.println("Invalid character: Enter Number or x/X");
				}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		String n=sc.next().trim();
		int result=sum(n);
		System.out.println("Sum = "+result);
		sc.close();
	}

}
