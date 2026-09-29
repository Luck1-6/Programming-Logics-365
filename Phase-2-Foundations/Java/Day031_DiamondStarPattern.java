package Phase_2_foundations;

import java.util.Scanner;

/**
 * Headline: Diamond Star Pattern
 * Description: Read N and print a diamond-shaped star pattern
where N represents the number of stars in the widest row.
 * Pseudocode:
num=input(); 

for (row = 1; row <= num; row++) {
    print spaces
    print increasing stars
}

for (row = 1; row < num; row++) {
    print spaces
    print decreasing stars
}
 */

// ---- Program ----

public class Day031_DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 0;

        for (int row = 1; row <= num; row++) {
            int star = row + count;
            count += 1;

            System.out.print(" ".repeat(num - row));
            System.out.println("*".repeat(star));
        }

        for (int row = num + 1; row < 2 * num; row++) {
            count -= 1;
            int star = (num * 2 - 1) - (row - num) * 2;

            System.out.print(" ".repeat(row - num));
            System.out.println("*".repeat(star));
        }

        sc.close();

	}

}
