package CodePractice;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
								
									// Method 1

//		Scanner sc=new Scanner(System.in);
//		int year=sc.nextInt();
//		
//		if(year%400==0)
//		{
//			System.out.println("Its Leap Year");
//		}
//		else if(year%100==0)
//		{
//			System.out.println("Its Not Leap Year");
//		}
//		else if(year%4==0)
//		{
//			System.out.println("Its Leap Year");
//		}else
//			System.out.println("Not Leap Year");
//		sc.close();

									// Method 2
	
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean b=false;
		
		if (year%4==0)
		{
			if (year%100==0)
			{
				if(year%400==0)
					b=true;
				else 
					b=false;
			}
			else
				b=true;
		}
		if (b==true)
		
			System.out.println("Leap Year");
		else
			System.out.println("Not LeapYear");
		sc.close();
	}
	

}
