package CodePractice;
import java.util.Scanner;
public class PalindromeTwoPointerApproach {

	public static void main(String[] args) {
		
						//1. Two Pointer Approach using For loop
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String :");
		
		String s=sc.next().trim().toLowerCase();
		boolean b=true;
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				b=false;
				break;
			}		
			
		}
		if(b)
			System.out.println(s+" is Palindrom");
		else
			System.out.println(s+" is Not Palindrome");
		sc.close();
		
						//2. Two Pointer Approach Using While Loop
		
//		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String s = sc.nextLine().toLowerCase();
//
//        int i = 0;
//        int j = s.length() - 1;
//        boolean isPalindrome = true;
//
//        while (i < j) {
//            if (s.charAt(i) != s.charAt(j)) {
//                isPalindrome = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//
//        if (isPalindrome) {
//            System.out.println("\"" + s + "\" is a palindrome.");
//        } else {
//            System.out.println("\"" + s + "\" is not a palindrome.");
//        }
//        sc.close();
		}		
	}


