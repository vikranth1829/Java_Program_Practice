package CodePractice;
import java.util.Scanner;
public class ReverseTheString {

	public static void main(String[] args) {
		
						//Using String to Array and Two pointer method
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any string :");
		String s=sc.next().trim();
		char[] arr=s.toCharArray();
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		String rev=new String(arr);
		System.out.println(rev);
		sc.close();
	
		
						//For loop straight Forward method	
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter any String: ");
//		String s=sc.next().trim();
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev+=s.charAt(i);
//		}
//		System.out.println(rev);
//		sc.close();
		
		
						//String Builder Method
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter any String:");
//		String s=new String();
//		s=sc.next().trim();
//		StringBuilder sb=new StringBuilder(s);
//		System.out.println(sb.reverse());
//		sc.close();
	}

}
