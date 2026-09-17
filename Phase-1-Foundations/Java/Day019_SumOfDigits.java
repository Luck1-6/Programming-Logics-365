package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Sum of Digits
 * Description: Read an integer and calculate the sum of all its digits.
 *
 * Pseudocode:
    input(num);
    sum = 0

    while num != 0:
      digit = num % 10
      sum = sum + digit
      num = num / 10

    print(sum)
 */

// ---- Program ----

public class Day019_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        N = Math.abs(N);

        int sum = 0;

        while (N != 0) {
            int digit = N % 10;
            sum = sum + digit;
            N = N / 10;
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();

	}

}
