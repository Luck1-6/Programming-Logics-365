package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Inverted Triangle Star Pattern
 * Description: Print an inverted right-angled triangle of stars.
 *
 * Pseudocode:
input(num)

for row = num; row >= 1; row--:
  for column = 1; column <= row; column++:
    print("*")

 */

// ---- Program ----
public class Day028_InvertedTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        for (int row = num; row >= 1; row--) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();

	}

}
