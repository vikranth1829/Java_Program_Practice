package CodePractice;

public class EvenDaysGoOut {

	public static void main(String[] args) {
		int aug=31;
		int count=0;
		for(int i=1;i<=aug;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println("Days out : "+count);
	}

}
