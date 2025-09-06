package MathsProgram;
import java.util.Scanner;
public class AreaOfParallelogram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of Parallelogram:");
		double height=sc.nextDouble();
		System.out.println("Enter the Base of Parallelogram:");
		double base=sc.nextDouble();
		double area=base*height;
		System.out.printf("Area of Parallelogram is :%.2f",area);
			
	}

}
