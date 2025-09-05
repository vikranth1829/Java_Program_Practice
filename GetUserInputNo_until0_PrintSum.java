package CodePractice;
import java.util.Scanner;
public class GetUserInputNo_until0_PrintSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the numbers:'0' to End:");
		while(true) 
		{
		 int num=sc.nextInt();
		if(num==0)
			break;
		sum=sum+num;
		}
		System.out.println(sum);
		sc.close();
}
}