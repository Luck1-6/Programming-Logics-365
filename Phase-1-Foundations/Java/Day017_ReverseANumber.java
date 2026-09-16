package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Reverse a Number
 * Description: Read an integer and print its digits in reverse order.
 *
 * Pseudocode:
    input(num);
    reverse = 0

    while num != 0:
      digit = num % 10
      reverse = reverse * 10 + digit
      num = num / 10

    print(reverse)
 */

// ---- Program ----

public class Day017_ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        num = Math.abs(num);

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();

	}

}
