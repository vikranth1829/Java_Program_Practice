package CodePractice;

import java.util.Scanner;

public class PrimeNoForLoop {

	public static void main(String[] args) {
		                                               
										//	if number is divisible by 1 and by itself is prime number
	    	
	    	Scanner sc=new Scanner(System.in);
	    	int n;
	    
	    	System.out.println("Enter any number");
	    	n=sc.nextInt();
	    	
	    	if(n<=1)
	    	{
	    		System.out.println("Neither Prime Nor Composit");
	    		return;
	    	}	
	        int count =0;
	        
	        for (int i=2; i<=n; i++)    	     //  for (int i=1; i*i<=n;i++) optimized 
	        {
	        	if(n%i==0)
	        	{
	        		count++;
	        	}
	        }
	       
	        if(count==0)
	    	   System.out.println("Prime Number");
	        else
	        	System.out.println("Not Prime Number");
	    	sc.close();
	  	}
}
