package MathsProgram;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length:");
		double length=sc.nextDouble();
		System.out.print("Enter Width:");
		double width=sc.nextDouble();
		
		double perimeter =2*(length+width);
		System.out.printf("Perimeter of Rectangle :%.2f",perimeter);
	}
}
