package MathsProgram;
import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side value:");
		double sides=sc.nextDouble();
		double perimeter=3*sides;
		System.out.printf("Perimeter of Triangle= %.2f",perimeter);
		sc.close();
	}
}
