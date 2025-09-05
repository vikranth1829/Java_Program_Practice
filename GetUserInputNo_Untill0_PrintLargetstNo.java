package CodePractice;
import java.util.Scanner;
public class GetUserInputNo_Untill0_PrintLargetstNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter numbers (0 to end):");

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            if (num > largest) largest = num;
        }

        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number: " + largest);
        }
        sc.close();
	}

}
