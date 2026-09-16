package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Check Palindrome Number
 * Description: Determine if a number reads the same forwards and backwards.
 *
 * Pseudocode:
 *  input(num);
    original = num
    reverse = 0
    while num != 0:
      digit = num % 10
      reverse = reverse * 10 + digit
      num = num / 10

    if original == reverse:
      print("Palindrome")
    else:
      print("Not a Palindrome")
 */

// ---- Program ----

public class Day018_CheckPalindromeNumber {

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

        if (original >= 0 && original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();

	}

}
