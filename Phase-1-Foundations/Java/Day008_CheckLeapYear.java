package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Check Leap Year
 * Description: Read a year and determine if it's a leap year.
 *
 * Pseudocode:
 class Day008_CheckLeapYear:
  main():
    Scanner sc = new Scanner(System.in);

    year = sc.nextInt()

    if year % 400 == 0:
      print("Leap Year")
    else if year % 100 == 0:
      print("Not a Leap Year")
    else if year % 4 == 0:
      print("Leap Year")
    else:
      print("Not a Leap Year")
 */

// ---- Program ----

public class Day008_CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = (year % 400 == 0);
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
	}

}

