package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Fibonacci Series (Iterative)
 * Description: Read N and print the first N Fibonacci numbers using a loop.
 *
 * Pseudocode:
    num1 = 0
    num2 = 1

    for i = 0; i < num; i++:
      print(num1)
      next = num1 + num2
      num1 = num2
      num2 = next
 */

// ---- Program ----

public class Day025_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < num; i++) {
            System.out.println(num1);

            int nextNumber = num1 + num2;
            num1 = num2;
            num2 = nextNumber;
        }

        sc.close();

	}

}
