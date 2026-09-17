package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Revision - Loops Recap
 * Description: Read a number and find its digit count, digit sum,
 * reverse, and whether it is a palindrome.
 *
 * Pseudocode:
 *     input(num);
 *
 *     original = num;
 *     num = Math.abs(num);
 *
 *     digitCount = 0;
 *     digitSum = 0;
 *     reverse = 0;
 *
 *     if (num == 0):
 *         digitCount = 1;
 *
 *     else:
 *         while (num != 0):
 *             digit = num % 10;
 *             digitCount++;
 *             digitSum = digitSum + digit;
 *             reverse = reverse * 10 + digit;
 *             num = num / 10;
 *
 *     print("Number of digits: " + digitCount);
 *     print("Sum of digits: " + digitSum);
 *     print("Reversed number: " + reverse);
 *
 *     if (original >= 0 && original == reverse):
 *         print("Palindrome: Yes");
 *     else:
 *         print("Palindrome: No");
*/

// ---- Program ----

public class Day020_LoopsRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        num = Math.abs(num);

        int digitCount = 0;
        int digitSum = 0;
        int reverse = 0;

        if (num == 0) {
            digitCount = 1;
        } else {
            while (num != 0) {
                int digit = num % 10;

                digitCount++;
                digitSum = digitSum + digit;
                reverse = reverse * 10 + digit;

                num = num / 10;
            }
        }

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Reversed number: " + reverse);

        if (original >= 0 && original == reverse) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        sc.close();

	}

}
