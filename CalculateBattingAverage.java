package CodePractice;
import java.util.Scanner;
public class CalculateBattingAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no Match Played : ");
		int match=sc.nextInt(); 
		System.out.print("Enter total Score : ");
		int score=sc.nextInt();
		System.out.println("Enter No of NotOut : ");
		int notout=sc.nextInt();
		
		int totmatch=match-notout;
		double avgscore=score/totmatch;
		System.out.printf("Batting Average : %.2f",avgscore);
	}
}
