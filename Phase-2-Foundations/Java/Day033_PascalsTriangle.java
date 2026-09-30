package Phase_2_foundations;

import java.util.Scanner;

/**
 * Headline: Pascal's Triangle
 * Description: Read N and print the first N rows of
 * Pascal's Triangle.
 *
 * Pseudocode:
number = int(input())
value = 1

for row in range(1, number + 1):
    print consecutive values for this row
    increase value after each number
 */

// ---- Program ----

// ---- Program ----

public class Day033_PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number for rows: ");
        int num = sc.nextInt();

        for (int row = 0; row < num; row++) {
            int value = 1;

            for (int column = 0; column <= row; column++) {
                System.out.print(value + " ");
                value = value * (row - column) / (column + 1);
            }

            System.out.println();
        }

        sc.close();

	}

}
