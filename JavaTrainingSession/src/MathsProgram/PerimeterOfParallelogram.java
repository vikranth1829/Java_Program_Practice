package MathsProgram;

import java.util.Scanner;

public class PerimeterOfParallelogram {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side a:");
		double sidea=sc.nextDouble();
		System.out.println("Enter side b:");
		double sideb=sc.nextDouble();
		
		double perimeter= 2*(sidea+sideb);
		System.out.printf("Permeter of Parallelogram: %.2f",perimeter);	
	}
}
