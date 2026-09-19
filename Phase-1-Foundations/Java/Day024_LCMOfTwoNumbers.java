package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: LCM of Two Numbers
 * Description: Compute the least common multiple of two numbers.
 *
 * Pseudocode:
    input (num1, num2);

    original_num1 = num1
    original_num2 = num2

    while num2 != 0:
      remainder = num1 % num2
      num1 = num2
      num2 = remainder

    gcd = num1
    lcm = (original_num1 * original_num2) / gcd

    print("LCM:", lcm)
 */

// ---- Program ----

public class Day024_LCMOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        int lcm;

        if (num1 == 0 || num2 == 0) {
            lcm = 0;
        } else {
            int num3 = num1;
            int num4 = num2;

            while (num4 != 0) {
                int remainder = num3 % num4;
                num3 = num4;
                num4 = remainder;
            }

            int gcd = num3;
            lcm = (num1 * num2) / gcd;
        }

        System.out.println("LCM: " + lcm);

        sc.close();

	}

}
