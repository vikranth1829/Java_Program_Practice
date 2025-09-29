package AdvancedOopsProgram;
import java.util.Arrays;
import java.util.Scanner;
public class ConcatenationOfArray {
	
	public int[] concatent(int[] a)
	{
		int n=a.length;
		int[]newarr=new int[n*2];
		for(int i=0;i<n;i++)
		{
			newarr[i]=a[i];
			newarr[i+n]=a[i];
		}
		return newarr;
	}
	public int[] getmethod(Scanner sc)
	{
		int[] arr=new int[3];
		System.out.print("Enter "+arr.length+" Array values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ConcatenationOfArray obj=new ConcatenationOfArray();
		int[] ans=obj.getmethod(sc);
		int[] newarr=obj.concatent(ans);
		System.out.println(Arrays.toString(newarr));
		sc.close();
	}

}
