package CodePractice;
import java.util.Scanner;
public class CalculateDistanceBetween2Points {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x1 value : ");
		double x1=sc.nextDouble();
		System.out.print("Enter y1 value : ");
		double y1=sc.nextDouble();
		System.out.print("Enter x2 value : ");
		double x2=sc.nextDouble();
		System.out.print("Enter y2 value : ");
		double y2=sc.nextDouble();
		
		double xsqrt=Math.pow((x2-x1), 2);
		double ysqrt=Math.pow((y2-y1), 2);
		
		double dist=Math.sqrt(xsqrt+ysqrt);
		System.out.println("Your distance b/w 2 Points :"+ dist);
		sc.close();
	}
}
