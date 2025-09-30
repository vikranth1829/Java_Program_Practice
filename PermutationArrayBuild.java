package CodePractice;

public class PermutationArrayBuild {

	public static void main(String[] args) {
		int[] num= {3,2,4,1,0};
		int[] result=new int[num.length];
		
		for(int i=0;i<=num.length;i++)
		{
			result[i]=num[num[i]];
			System.out.print(result[i]);
		}
		
	}

}
