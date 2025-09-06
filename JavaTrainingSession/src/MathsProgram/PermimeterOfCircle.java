package MathsProgram;
import java.util.Scanner;
public class PermimeterOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		double radius=sc.nextDouble();
		double perimeter=Math.PI*2*radius;
		System.out.printf("Perimeter of Circle :%.2f",perimeter);
		sc.close();
	}
}
