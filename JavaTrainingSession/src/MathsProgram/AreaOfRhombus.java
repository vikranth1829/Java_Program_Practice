package MathsProgram;
import java.util.Scanner;
public class AreaOfRhombus {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of Rhombus:");
		double base=sc.nextDouble();
		System.out.println("Enter height of Rhombus:");
		double height=sc.nextDouble();
		double area=height*base;
		System.out.printf("Area of Rhombus is :%.2f",area);
	}

}
