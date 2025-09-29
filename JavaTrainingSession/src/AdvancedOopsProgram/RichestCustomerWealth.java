package AdvancedOopsProgram;

public class RichestCustomerWealth {

	public int richcust(int[][] nums)
	{
		int r=nums.length;
		int c=nums[0].length;
		int biggest=Integer.MIN_VALUE;
		for(int i=0;i<r;i++)
		{
			int sum=0;
			for(int j=0;j<c;j++)
			{
				sum+=nums[i][j];
			}
			if(sum>biggest)
				biggest=sum;
		}
		return biggest;
	}
	public static void main(String[] args) {
		RichestCustomerWealth obj=new RichestCustomerWealth();
		int[][] bal={{3,6,9},{2,7,6},{6,2,9}};
		int ans=obj.richcust(bal);
		System.out.println("Richest Wealth : "+ans);

	}

}
