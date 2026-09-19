package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: GCD of Two Numbers
 * Description: Compute the greatest common divisor of two numbers
 * using the Euclidean algorithm.
 *
 * Pseudocode:
    input= map(num1, num1);

    while num1 != 0:
      remainder = num1 % num2
      num1 = num2
      num2 = remainder

    print("GCD:", num1)
 */

// ---- Program ----

public class Day023_GCDOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        System.out.println("GCD: " + num1);

        sc.close();

	}

}
