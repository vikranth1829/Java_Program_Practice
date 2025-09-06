package MathsProgram;

import java.util.Scanner;

public class PerimeterOfRhombus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Side:");
		double side=sc.nextDouble();

		double perimeter =4*side;
		System.out.printf("Perimeter of Rhombus :%.2f",perimeter);
	}
}
