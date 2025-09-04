package CodePractice;
import java.util.Scanner;
public class PalindromeStringBuilderClass {

	public static void main(String[] args) {
		
		
	     Scanner sc=new Scanner (System.in);
	     String s=sc.next().trim().toLowerCase();
	     
	     StringBuilder sb1=new StringBuilder(s);
	     
	     sb1.reverse();
	     if(s.equals(sb1.toString()))
	     
	    	 System.out.println("Your String is Palindrom");
	     else
	    	 System.out.println("Your String is Not Palindrom");
	     sc.close();

	}

}
