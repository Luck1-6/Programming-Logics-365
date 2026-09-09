package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Find Maximum of Three Numbers
 * Description: Read three integers and print the largest.
 *
 * Pseudocode:
class Day006_FindMaximumOfThreeNumbers:
  main():
    Scanner sc = new Scanner(System.in);

    a = sc.nextInt()
    b = sc.nextInt()
    c = sc.nextInt()

    if a > b and a > c:
      print("Maximum:", a)
    else if b > a and b > c:
      print("Maximum:", b)
    else:
      print("Maximum:", c)
 **/

// ---- Program ----

public class Day006_FindMaximumOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int maximum = a;
        if (b > maximum) maximum = b;
        if (c > maximum) maximum = c;

        System.out.println("Maximum: " + maximum);
        sc.close();

	}

}
