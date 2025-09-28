package AdvancedOopsProgram;

import java.util.Arrays;

public class KidsWithGreatestNumberOfCandies {
	
	public boolean[] gnc(int[] arr)
	{
		int ext=3;
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=max)
				max=arr[i];
		}
		boolean[] res=new boolean[n];
		for(int i=0;i<n;i++)
		{
			if((arr[i]+ext)>=max)
				res[i]=true;
			else 
				res[i]=false;
		}	

		return res;		
	}
	


	public static void main(String[] args) {
		KidsWithGreatestNumberOfCandies obj =new KidsWithGreatestNumberOfCandies();
		int[] ch= {2,5,1,4,2};
		boolean[] res=obj.gnc(ch);
				
		for(int j=0;j<res.length;j++) 
		{
			System.out.print(res[j]+" ");
		}

	//	System.out.println(Arrays.toString(res));
	}
}