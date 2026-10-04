package Phase_2_foundations;

import java.util.Scanner;

/**
 * Headline: Number Pyramid
 * Description: Read N and print a number pyramid where
 * each row repeats its row number.
 *
 * Pseudocode:
input(num)

for row = 1 to num:

  print spaces

  for column = 1 to row:
    print row

  move to next line
 */

// ---- Program ----

public class Day034_NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {

            // Print spaces
            for (int space = 1; space <= num - row; space++) {
                System.out.print("  ");
            }

            // Print row number
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }

        sc.close();

	}

}
