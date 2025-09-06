package CodePractice;
import java.util.Scanner;
public class GetUserInputNo_Untill0_PrintLargetstNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers(zero to End):");
		int largest =Integer.MIN_VALUE;
		int num;
		while(true)  //for(;;)
		{
			num=sc.nextInt();
			if(num==0)
				break;
			if(num>largest)
				largest=num;
		}
		if(largest==Integer.MIN_VALUE)
			System.out.println("No Numbers are entered!");
		else 
			System.out.println("Largest Number is : "+largest);
		sc.close();
	}
}
