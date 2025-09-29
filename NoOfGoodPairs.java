package CodePractice;

public class NoOfGoodPairs {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,1,1,3};
		int n=arr.length;
		int count=0;
		for (int i=0;i<=n-1;i++)
		{
			for(int j=i+1;j<=n-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;	
					System.out.print("("+i+","+j+")");
				}
			}
		}
		System.out.println("\n"+count);
	}

}
