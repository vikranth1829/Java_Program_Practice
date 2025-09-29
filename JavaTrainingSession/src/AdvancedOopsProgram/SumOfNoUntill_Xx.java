package AdvancedOopsProgram;
import java.util.Scanner;
public class SumOfNoUntill_Xx {
	
	public static int sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		
		int sum=0;
		while(true)
		{
			String s=sc.next().trim();
			
			if(s.equalsIgnoreCase("x"))
			{
				break;
			}	
			try{
				int n=Integer.parseInt(s);
				sum=sum+n;
				}catch(NumberFormatException e)
				{
					System.out.println("Invalid character: Enter Number or x/X");
				}
		}
		sc.close();
		return sum;
	}
	public static void main(String[] args) {
		
		int result=sum();
		System.out.println("Sum = "+result);	
	}
}
