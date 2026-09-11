package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Revision - Conditionals Recap
 * Description: Read a number and print its sign, parity, and whether it is divisible by 5.
 *
 * Pseudocode:
class Day010_ConditionalsRecap:
  main():
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt()

    if n > 0:
      print("Positive")
    else if n < 0:
      print("Negative")
    else:
      print("Zero")

    if n % 2 == 0:
      print("Even")
    else:
      print("Odd")

    if n % 5 == 0:
      print("Divisible by 5")
    else:
      print("Not divisible by 5")
 */

// ---- Program ----

public class Day010_ConditionalsRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check sign
        if (n > 0) {
            System.out.println("Sign: Positive");
        } else if (n < 0) {
            System.out.println("Sign: Negative");
        } else {
            System.out.println("Sign: Zero");
        }

        // Check parity
        if (n % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        // Check divisibility by 5
        if (n % 5 == 0) {
            System.out.println("Divisible by 5: Yes");
        } else {
            System.out.println("Divisible by 5: No");
        }

        sc.close();

	}

}
