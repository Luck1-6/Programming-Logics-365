package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Add Two Numbers
 * Description: Read two integers and print their sum.
 *
 * Pseudocode:
class Day002_AddTwoNumbers:
  main():
    a = input()
    b = input()
    sum = a + b
    print("Sum:", sum)
 */

// ---- Program ----

public class Day002_AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
        sc.close();

	}

}
