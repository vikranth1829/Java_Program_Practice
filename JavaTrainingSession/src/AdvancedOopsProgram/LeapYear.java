package AdvancedOopsProgram;
import java.util.Scanner;
public class LeapYear {

	public static boolean findleap(int y)
	{
		
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					return true;
				}
				else {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Year : ");
		int year=sc.nextInt();
		if(findleap(year))
			System.out.println("Leap Year");
		else 
			System.out.println("Not a Leap Year");
		sc.close();	
	}
}
