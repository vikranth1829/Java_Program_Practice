package CodePractice;
import java.util.Scanner;
public class PalindromBrutalForceApproach {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  String s=sc.next().trim();
		  String rev="";
		
		  for(int i=s.length()-1;i>=0;i--)
		  {
			rev=rev+s.charAt(i);
		  }
		
		  if(rev.equals(s))
		
			 System.out.println("Palindrom");
		  else
			 System.out.println("Not palindrom");
		  sc.close();
		
	}

}
