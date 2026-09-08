package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Check Even or Odd
 * Description: Read an integer and print whether it's even or odd.
 *
 * Pseudocode:
class Day004_CheckEvenOrOdd:
  main():
    n = input()

    if n % 2 == 0:
      print("Even")
    else:
      print("Odd")
 */

// ---- Program ----

public class Day004_CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();

	}

}
