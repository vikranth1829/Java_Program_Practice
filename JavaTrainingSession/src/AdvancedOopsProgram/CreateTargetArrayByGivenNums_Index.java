package AdvancedOopsProgram;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayByGivenNums_Index {

	static List<Integer> target(int[] nums,int[] index)
	{
		List<Integer> arr=new ArrayList<>();
		for(int i=0;i<index.length;i++)
		{
			arr.add(index[i], nums[i]);
		}
	return arr;
	}
	public static void main(String[] args) {
			
		int[] nums= {2,4,6,8,10};
		int[] index= {0,1,2,3,4};
		List<Integer> target=new ArrayList<>();
		target=target(nums,index);
		System.out.println(target);	
	}
}

		
