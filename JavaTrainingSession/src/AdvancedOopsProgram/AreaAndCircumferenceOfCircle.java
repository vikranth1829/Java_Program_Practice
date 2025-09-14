package AdvancedOopsProgram;
import java.util.Scanner;
public class AreaAndCircumferenceOfCircle {
	
	public static double circumcircle(double a)
	{
		return Math.PI*2*a;
	}
	
	public static double areacircle(double a)
	{
		return Math.PI*Math.pow(a, 2);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius :");
		double r=sc.nextDouble();
		System.out.printf("Circumference :%.2f\n",circumcircle(r));
		System.out.printf("Area : %.2f",areacircle(r));
		sc.close();
	}
}
