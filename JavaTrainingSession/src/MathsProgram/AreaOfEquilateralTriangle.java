package MathsProgram;
import java.util.Scanner;
public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side :");
		double side=sc.nextDouble();
		double area= Math.sqrt(3)/4*Math.pow(side, 2);
		System.out.printf("Area of Equilateral Triangle is: %.2f",area);
	}
}
