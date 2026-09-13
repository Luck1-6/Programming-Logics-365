package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Sum of First N Natural Numbers
 * Description: Read N and compute the sum 1 + 2 + ... + N.
 *
 * Pseudocode:
    input(n);

    next line;
    sum = 0

    for i = 1; i <= n; i++:
      sum = sum + i

    println(sum);
 */

// ---- Program ----

public class Day013_SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);

        sc.close();


	}

}
