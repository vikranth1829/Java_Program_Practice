package CodePractice;

public class SamllerThanCurrentNosCount {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4};
		int n=arr.length;
		
		for(int i=0;i<=n-1;i++)
		{
			int count =0;
			for(int j=0;j<=n-1;j++)
			{
				if(arr[j]<arr[i])
					count++;
			}
			System.out.println(count+" ");
		}
	}
}
