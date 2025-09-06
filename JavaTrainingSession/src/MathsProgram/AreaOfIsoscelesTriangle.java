package MathsProgram;
import java.util.Scanner;
public class AreaOfIsoscelesTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base of Isosceles Triangle:");
		double base=sc.nextDouble();
		System.out.print("Enter height of Isosceles Triangle:");
		double height=sc.nextDouble();
		
		double area=base*height*0.5;
		System.out.printf("Area of Isosceles Triangle is :"+"%.2f",area);

	}

}
