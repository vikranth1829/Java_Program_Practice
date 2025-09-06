package JavaBasicsProgram;

public class Factorial {
	public static void main(String[] args) {
									
								//For Loop
//		int n=1;
//		int fact=1;
//		if(n==0||n==1)
//			System.out.println(0);
//		else if(n==1) 
//			System.out.println(1);
//		else
//			for(int i=1;i<=n;i++)
//			{
//				fact=fact*i;
//			}
//		System.out.println(n+"! is :"+fact);
					
								//While loop
					
		int n=5;
		int fact=1;
		int i=2;
		if(n==0||n==1)
			System.out.println(1);
		else
			while(i<=n)
			{
				fact=fact*i;	
				i++;
			}
		System.out.print(n+"! is : "+fact);
	}	
}
