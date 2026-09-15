package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Multiplication Table
 * Description: Read N and print its multiplication table from 1 to 10.
 *
 * Pseudocode:
class Day015_MultiplicationTable:
  main():
    input(num);

    for i = 1; i <= 10; i++:
      result = num * i
      print(num, "x", i, "=", result)
 */

// ---- Program ----

public class Day015_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }

        sc.close();

	}

}
