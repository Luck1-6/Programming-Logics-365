package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Factorial of a Number
 * Description: Read N and compute N! iteratively using a loop.
 *
 * Pseudocode:
    
    input(n);
    factorial = 1

    for i = 1; i <= n; i++:
      factorial = factorial * i

    print(factorial);
 */

// ---- Program ----

public class Day014_FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);

        sc.close();

	}

}
