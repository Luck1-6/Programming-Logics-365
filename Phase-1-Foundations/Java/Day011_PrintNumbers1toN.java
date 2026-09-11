package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Print Numbers 1 to N
 * Description: Read N and print integers from 1 through N.
 *
 * Pseudocode:
class Day011_PrintNumbers1ToN:
  main():
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt()

    for i = 1; i <= n; i++:
      print(i)
 */

// ---- Program ----

public class Day011_PrintNumbers1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        sc.close();

	}

}
