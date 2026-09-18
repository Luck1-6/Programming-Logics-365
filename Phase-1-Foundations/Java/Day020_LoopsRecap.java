```java
package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Revision - Loops Recap
 * Description: Read a number and find its digit count, digit sum,
 * reverse, and whether it is a palindrome.
 *
 * Pseudocode:
 *
 *     input(num);
 *
 *     digitCount = countDigits(num);
 *     digitSum = sumOfDigits(num);
 *     reverse = reverseNumber(num);
 *     palindrome = isPalindrome(num);
 *
 *     print all results;
 */

// ---- Functions ----

public class Day020_LoopsRecap {

    // Function 1: Count the number of digits
    public static int countDigits(int num) {

        num = Math.abs(num);

        if (num == 0) {
            return 1;
        }

        int digitCount = 0;

        while (num != 0) {
            digitCount++;
            num = num / 10;
        }

        return digitCount;
    }

    // Function 2: Calculate the sum of digits
    public static int sumOfDigits(int num) {

        num = Math.abs(num);

        int digitSum = 0;

        while (num != 0) {
            int digit = num % 10;
            digitSum = digitSum + digit;
            num = num / 10;
        }

        return digitSum;
    }

    // Function 3: Reverse the number
    public static int reverseNumber(int num) {

        num = Math.abs(num);

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }

    // Function 4: Check whether the number is palindrome
    public static boolean isPalindrome(int num) {

        // Negative numbers are not considered palindrome
        if (num < 0) {
            return false;
        }

        int reverse = reverseNumber(num);

        return num == reverse;
    }

    // ---- Main Program ----

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digitCount = countDigits(num);
        int digitSum = sumOfDigits(num);
        int reverse = reverseNumber(num);
        boolean palindrome = isPalindrome(num);

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Reversed number: " + reverse);

        if (palindrome) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        sc.close();
    }
}
```

