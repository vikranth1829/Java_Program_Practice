package MathsProgram;
import java.util.Scanner;
public class PerimeterOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Entet the radius of Circle :");
		double radius= sc.nextDouble();
		double perimeter=Math.PI*2*radius;
		System.out.printf("Perimeter of Circle is :%.2f",perimeter);
	}
}
