package CodePractice;
import java.util.Scanner;
public class Subtract_Sum_From_Product_FromUserInputNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=sc.nextInt();
		int fact=1;
		int sum=0;
			if(num==0)
			{
				System.out.println("You Entered Zero!");
				sc.close();
				return;
			}else {
			for(int i=num;i!=0;i=i/10)
			{
				int rem=i%10;
				fact=fact*rem;
				sum=sum+rem;
				}
			}
		System.out.println(fact-sum);
		sc.close();
	}
}
