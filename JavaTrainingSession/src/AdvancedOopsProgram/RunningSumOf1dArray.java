package AdvancedOopsProgram;
import java.util.Scanner;
import java.util.Arrays;
public class RunningSumOf1dArray {
	
	public static int[] runningSums(int[] nums, int n)
	{
		int [] runsum=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+nums[i];
			runsum[i]=sum;
		}
		return runsum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Array :");
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		int[] res=runningSums(nums,n);
		System.out.println(Arrays.toString(res)+" ");
		sc.close();
		
	}

}
