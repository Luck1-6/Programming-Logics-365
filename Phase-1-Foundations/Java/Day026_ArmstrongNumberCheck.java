package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Armstrong Number Check
 * Description: Check if a number equals the sum of its digits raised
 * to the power of the number of digits.
 *
 * Pseudocode:
input(num)
original = num
count = 0
sum = 0

while num != 0:
  num = num / 10
  count = count + 1

num = original

while num != 0:
  digit = num % 10
  sum = sum + Math.pow(digit, count)
  num = num / 10

if sum == original:
  print("Armstrong Number")
else:
  print("Not an Armstrong Number")
 */

// ---- Program ----
public class Day026_ArmstrongNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        num = Math.abs(num);

        // Count digits
        int digitCount = 0;

        if (num == 0) {
            digitCount = 1;
        } else {
            int temp = num;

            while (temp > 0) {
                temp = temp / 10;
                digitCount++;
            }
        }

        // Calculate Armstrong sum
        int temp = num;
        int armstrongSum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            armstrongSum = armstrongSum
                    + (int) Math.pow(digit, digitCount);

            temp = temp / 10;
        }

        // Check result
        if (original >= 0 && armstrongSum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}
