package MathsProgram;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Base of Triangle :");
		double base=sc.nextDouble();
		System.out.print("Enter Height of Triangle :");
		double height=sc.nextDouble();
		
		double area=height*base*0.5;
		System.out.printf("Area of Triangle : "+"%.2f%n",area);
		sc.close();

	}

}
