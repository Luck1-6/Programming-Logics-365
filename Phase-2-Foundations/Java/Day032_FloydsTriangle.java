package Phase_2_foundations;

import java.util.Scanner;

/**
 * Headline: Floyd's Triangle
 * Description: Read N and print Floyd's Triangle with N rows
 * using consecutive natural numbers.
 *
 * Pseudocode:
input(num)

value = 1

for row = 1 to num:

  for column = 1 to row:
    print value
    increase value by 1

  move to next line
 */

// ---- Program ----

public class Day032_FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        int value = 1;

        for (int row = 1; row <= num; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print(value + " ");
                value = value + 1;
            }

            System.out.println();
        }

        sc.close();

	}

}
