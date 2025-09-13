package AdvancedOopsProgram;
import java.util.Scanner;
public class MarksAndGradeSystem {
	public static String findgrade(int mark)
	{
		if(mark>=91)
			return "AA";
		else if(mark>=81)
			return "AB";
		else if(mark>=71)
			return "BB";
		else if(mark>=61)
			return "BC";
		else if(mark>=51)
			return "CD";
		else if(mark>=41)
			return "DD";
		else
			return "Fail";
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true) {									//if the mark is invalid again get the mark until get the proper mark
			System.out.print("Enter your mark: ");
			int mark=sc.nextInt();
			if (mark<0||mark>100)
				System.out.println("Invalid Marks");
			else {
				String grade=findgrade(mark);
				System.out.println("Your Grade is : "+grade);
				break;												//break the loop if print grade with valid mark
				}
		}
		sc.close();
	}
}
