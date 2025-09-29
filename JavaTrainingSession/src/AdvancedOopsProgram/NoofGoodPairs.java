package AdvancedOopsProgram;

public class NoofGoodPairs {

	
	public int goodpairs(int[] arr)
	{
		int n=arr.length;
		int count=0;
		
		for(int i=0;i<=n-1;i++)
		{
			for(int j=i+1;j<=n-1;j++)
			{
				if(arr[i]==arr[j])
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		NoofGoodPairs obj=new NoofGoodPairs();
		int[] arr= {1,2,3,1,1,3};
		int res=obj.goodpairs(arr);
		System.out.println(res);
		
	}

}
