package MathsProgram;
import java.util.Scanner;
public class FactorsOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		int num=sc.nextInt();
		
//		if(sc.hasNextInt())
//		{
//		 num=sc.nextInt();
//		}else {
//			System.out.println("Invalid Input : Enter integer:");
//			sc.next();
//		}
		
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.println(i+" ");
				}
			}
		}else {
		System.out.println("Enter number greater than Zero");	
	}
}
}