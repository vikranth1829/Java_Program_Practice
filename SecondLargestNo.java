package CodePractice;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
		
						//Using One Pass Search to find second largest Number 
		
//		int[] arr= {10,20,30,40};
//		int largest=Integer.MIN_VALUE;
//		int slargest=Integer.MIN_VALUE;
//		
//		for(int num:arr)
//		{
//			if(num>largest)
//			{
//				slargest=largest;
//				largest=num;
//			}
//		else if(num>slargest &&num!=largest)
//		{
//			slargest=num;
//		}
//		}
//		
//		if(slargest==Integer.MIN_VALUE)
//			System.out.println("No Second Largest Element");
//		else
//			System.out.println("Second Largest : "+ slargest);
		
						// Using Sort to find second largest number
		
		int[] arr= {8,8,8};
		int n=arr.length;
		
		Arrays.sort(arr);
		int slargest=-1;
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]!=arr[n-1])
			{
				slargest=arr[i];
				break;
			}
		}
		System.out.println(slargest);
		}
}
