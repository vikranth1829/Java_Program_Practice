package AdvancedOopsProgram;
import java.util.Scanner;
public class PalindromeString {

	public static boolean palindromeSB(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		String rev=sb.reverse().toString();
		if(rev.equals(s))
			return true;
		else 
			return false;
	}
	public static boolean palindromeTwoPoint(String s)
	{
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	public static boolean palindromeBrutalapp(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any String :");
		String s=sc.next().trim().toLowerCase();
		//boolean b=palindromeSB(s);
		//boolean b1=palindromeBrutalapp(s);

		boolean b=palindromeTwoPoint(s);
		if(b)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
