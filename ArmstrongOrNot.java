package CodePractice;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.print("Enter any Number : ");
    	int n=sc.nextInt();
    	int sum=0;
    	int rem=0;
    	int temp=n;
    	int orgi=n;
    	int digit=0;
    	
    	while(temp!=0)
    	{
    		digit++;
    		temp=temp/10;
    	}
    	
    	temp=n;
    	for(;temp!=0;temp=temp/10)
    	{
    		rem=n%10;
    		sum=sum+(int)Math.pow(rem,digit);
    	}
    	if(orgi==sum)
    		System.out.println("Armstrong");
    	else
    		System.out.println("Not Armstrong");
	}

}
