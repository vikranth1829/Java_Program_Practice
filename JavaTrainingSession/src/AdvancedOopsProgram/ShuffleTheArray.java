package AdvancedOopsProgram;

public class ShuffleTheArray {
	
	public int[] shuffle(int[] nums)
	{
		int n=nums.length/2;
		int[] newarr=new int[nums.length];
		for(int i=0;i<n;i++)
		{
			newarr[2*i]=nums[i];    //i=0,1,2  newarr=0,2,4
			newarr[2*i+1]=nums[n+i]; 
		}
		return newarr;
	}
	public static void main(String[] args) {
		ShuffleTheArray sf=new ShuffleTheArray();
		int[] arr= {1,3,5,2,4,6};
		int[] newarr=sf.shuffle(arr);
		for(int n:newarr)
		{
		System.out.print(n);
		}

	}

}
