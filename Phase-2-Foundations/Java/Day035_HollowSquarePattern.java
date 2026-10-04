package Phase_2_foundations;

import java.util.Scanner;

/**
 * Headline: Hollow Square Pattern
 * Description: Read N and print an N x N square of stars
 * with stars only on the boundary and spaces inside.
 *
 * Pseudocode:
input(num)

for row = 1 to num:

  for column = 1 to num:

    if row is first row
       OR row is last row
       OR column is first column
       OR column is last column:
      print "*"
    else:
      print space

  move to next line
 */

// ---- Program ----

public class Day035_HollowSquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {

            for (int column = 1; column <= num; column++) {

                if (row == 1 || row == num || column == 1 || column == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

	}

}
