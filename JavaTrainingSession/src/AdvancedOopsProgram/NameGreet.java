package AdvancedOopsProgram;
import java.util.Scanner;
public class NameGreet {
	
	public void greet()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name :");
		String name=sc.nextLine();
		System.out.println("Welcome !"+name);
		sc.close();
	}
	public static void main(String[] args) {
		NameGreet n=new NameGreet();
		n.greet();
	}
}
