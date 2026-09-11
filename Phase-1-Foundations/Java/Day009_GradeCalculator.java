package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Grade Calculator
 * Description: Read a percentage score and print the corresponding letter grade.
 *
 * Pseudocode:
class Day009_GradeCalculator:
  main():
    Scanner sc = new Scanner(System.in);

    marks = sc.nextInt()

    if marks >= 90:
      print("Grade A")
    else if marks >= 80:
      print("Grade B")
    else if marks >= 70:
      print("Grade C")
    else if marks >= 60:
      print("Grade D")
    else if marks >= 50:
      print("Grade E")
    else:
      print("Grade F")
 */

// ---- Program ----

public class Day009_GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage score: ");
        double score = sc.nextDouble();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else if (score >= 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();

	}

}
