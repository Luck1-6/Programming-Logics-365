package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Swap Two Numbers
 * Description: Swap two variables' values without using a third variable.
 *
 * Pseudocode:
class Day003_SwapTwoNumbers:
  main():
    a = input()
    b = input()

    temp = a
    a = b
    b = temp

    print("After swapping:", a, b)
 */

// ---- Program ----

public class Day003_SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
        sc.close();

	}

}
