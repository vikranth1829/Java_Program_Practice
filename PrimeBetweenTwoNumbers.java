package CodePractice;
import java.util.Scanner;
public class PrimeBetweenTwoNumbers {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter 1st Number : ");
		 int fn=sc.nextInt();
		 System.out.print("Enter last Number : ");
		 int ln=sc.nextInt();
		 
		 for(int n=fn;n<=ln;n++) 		//loop for first no to last no
		 {
			 if(n>1) 
			 {
				boolean b=true;
				for(int i=2;i<n;i++)		//take each number from previous for loop and combine from 2 to nth value
				{
					if(n%2==0)
					{
						b=false;
						break;
					}
				}
				 if(b)
					 System.out.print(n+" ");
			 }
		 }
		 sc.close();
	}
}
