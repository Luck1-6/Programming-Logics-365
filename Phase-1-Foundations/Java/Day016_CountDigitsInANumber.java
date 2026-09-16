package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Count Digits in a Number
 * Description: Read an integer and count the number of digits using a loop.
 *
 * Pseudocode:
    
    input(num);
    count = 0

    while num != 0:
      num = num / 10
      count = count + 1

    print(count)
 */

// ---- Program ----

public class Day016_CountDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        int digitCount = 0;

        if (num == 0) {
            digitCount = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                digitCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);

        sc.close();

	}

}
