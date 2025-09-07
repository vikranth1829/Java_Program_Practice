package CodePractice;
import java.util.Scanner;

public class ArmstrongBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the last number: ");
        int last = sc.nextInt();

        System.out.println("Armstrong numbers between " + first + " and " + last + ":");

        for (int num = first; num <= last; num++) {
            int original = num;
            int temp = num;
            int digits = 0;
            int sum = 0; 

            // Count digits
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
         
            temp = num;

            // Calculate Armstrong sum
            while (temp != 0) {
                int rem = temp % 10;
                sum += (int)Math.pow(rem, digits); // cast to int for safe assignment
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }

        sc.close();
    }
   }
  
