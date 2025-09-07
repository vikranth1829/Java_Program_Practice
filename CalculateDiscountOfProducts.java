package CodePractice;
import java.util.Scanner;

public class CalculateDiscountOfProducts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Product Price : ");
		double price=sc.nextDouble();
		System.out.println("Enter Discount % : ");
		double discper=sc.nextDouble();
			
		double disc=(price*discper)/100;
		double discprice=price-disc;

		if(discper>0)
			System.out.printf("Your Discount Price is : %.2f",discprice);
		else
			System.out.printf("No Discount! : Your Price=%.2f",price);
		sc.close();
	}
}
