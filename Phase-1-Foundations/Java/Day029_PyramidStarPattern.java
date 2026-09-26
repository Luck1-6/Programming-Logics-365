package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Pyramid Star Pattern
 * Description: Print a centered pyramid of stars with N rows.
 *
 * Pseudocode:
input(num

for row = 1; i <= num; column++:
  for column = 1; column <= num - row; column++:
    print(" ", end=" ")

  for column = 1; column <= 2 * row - 1; column++:
    print("*", end=" ")

  print()
 */

// ---- Program ----
public class Day029_PyramidStarPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {

            // Print spaces
            for (int column = 1; column <= column - row; column++) {
                System.out.print("  ");
            }

            // Print stars
            for (int column = 1; column <= 2 * row - 1; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
