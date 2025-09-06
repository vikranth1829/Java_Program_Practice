package MathsProgram;

import java.util.Scanner;

public class AreaOfRhombus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter height:");
		double height=sc.nextDouble();
		System.out.print("Enter base:");
		double base=sc.nextDouble();
		
		double area =height*base*0.5;
		System.out.printf("Area of Rhombus :%.2f",area);
	}		
}
