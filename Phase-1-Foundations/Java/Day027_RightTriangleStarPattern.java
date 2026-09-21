package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Right Triangle Star Pattern
 * Description: Print a right-angled triangle of stars with N rows.
 *
 * Pseudocode:
umput(num)

for row = 1; i <= num; i++:
  for column = 1; column <= row; column++:
    print("*")
  print()
 */

// ---- Program ----
public class Day027_RightTriangleStarPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}

