package MathsProgram;

import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Side:");
		double side=sc.nextDouble();

		double perimeter =4*side;
		System.out.printf("Perimeter of Square :%.2f",perimeter);
	}
}
