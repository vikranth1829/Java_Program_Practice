package JavaBasicsProgram;

public class FactorialRecursion {

//	static int factorial(int a)
//	{
//		if(a<=1)
//		{
//			return 1;
//		}
//		else {
//		
//		int fact=a*factorial(a-1);
//		return fact;
//		}
//	}
		
	public static void main(String[] args) {

		//System.out.println(factorial(5));
		
	
		
		int n=5;
		int fact=1;
		//int factorial=1;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
}
