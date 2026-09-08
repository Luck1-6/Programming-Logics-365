package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Find Maximum of Two Numbers
 * Description: Read two integers and print the larger one.
 *
 * Pseudocode:
class Day005_FindMaximumOfTwoNumbers:
  main():
    a = input()
    b = input()

    if a > b:
      print("Maximum:", a)
    else:
      print("Maximum:", b)
 */

// ---- Program ----

public class Day005_FindMaximumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Maximum: " + a);
        } else {
            System.out.println("Maximum: " + b);
        }
        sc.close();

	}

}
