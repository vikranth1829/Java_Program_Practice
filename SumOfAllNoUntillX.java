package CodePractice;
import java.util.Scanner;
public class SumOfAllNoUntillX {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		System.out.println("Enter the number:(x/X to Stop)");
		while(true)
		{
			
			String s= sc.next().trim();       //get the String input and trim the front and back spaces
			if(s.equalsIgnoreCase("x"))				//compare the string in s and character 'x'
				break;
		
				try {
						int num=Integer.parseInt(s);   //convert the string to integer
						sum=sum+num;
									
				     }catch(NumberFormatException e)  //handling exception of 
						{			
					    System.out.println("Invalid character!: Enter Number or x");
						}
		}
			System.out.println(sum);
			sc.close();
	}	
	
}
		
	


