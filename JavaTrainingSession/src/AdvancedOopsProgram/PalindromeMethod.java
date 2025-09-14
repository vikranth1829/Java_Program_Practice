package AdvancedOopsProgram;
import java.util.Scanner;
public class PalindromeMethod {
	
	public static boolean palindrome(String s)
	{
		
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
				break;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any String : ");
		String s=sc.next().trim().toLowerCase();
		Boolean b=palindrome(s);
		if(b)
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrom");
	}

}
