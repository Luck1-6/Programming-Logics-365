package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Simple Calculator
 * Description: Read two numbers and an operator (+, -, *, /); print the result.
 *
 * Pseudocode:
class Day007_SimpleCalculator:
  main():
    Scanner sc = new Scanner(System.in);

    a = sc.nextInt()
    b = sc.nextInt()
    operator = sc.next()

    if operator == "+":
      result = a + b
      print("Result:", result)
    else if operator == "-":
      result = a - b
      print("Result:", result)
    else if operator == "*":
      result = a * b
      print("Result:", result)
    else if operator == "/":
      result = a / b
      print("Result:", result)
    else:
      print("Invalid operator")
 */

// ---- Program ----

public class Day007_SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double A = sc.nextDouble();
        System.out.print("Enter second number: ");
        double B = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            double result = A + B;
            System.out.println("Result: " + result);

        } else if (operator == '-') {
            double result = A - B;
            System.out.println("Result: " + result);

        } else if (operator == '*') {
            double result = A * B;
            System.out.println("Result: " + result);

        } else if (operator == '/') {
            if (B != 0) {
                double result = A / B;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero");
            }

        } else {
            System.out.println("Invalid operator");
        }

        sc.close();

	}

}
