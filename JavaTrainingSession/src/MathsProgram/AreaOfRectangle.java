package MathsProgram;
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Height of Rectagle:");
		double height=sc.nextDouble();
		System.out.print("Enter Width of Rectagle:");
		double width=sc.nextDouble();
		double area=height*width;
		System.out.printf("Area of Rectangle is :%.2f",area);
	}

}
