package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Revision - Phase 1 Mixed Challenge
 * Description: Read N and combine factorial calculation, prime checking,
 * and right triangle star pattern printing in one program.
 *
 * Pseudocode:
input(num)

# Calculate factorial
factorial = 1

for check_num = 1; check_num <= num; check_num++:
  factorial = factorial * check_num

print("Factorial:", factorial)

# Check prime
is_prime = true

if num < 2:
  is_prime = false
else:
  for test_num = 2; test_num < num; test_num++:
    if num % test_num == 0:
      is_prime = false
      break

if is_prime:
  print(num, "is a prime number")
else:
  print(num, "is not a prime number")

# Print right triangle pattern
print("Star Pattern:")

for row = 1; row <= num; row++:
  for column = 1; column <= row; column++:
    print("*", end=" ")
  print()
 */

// ---- Program ----
public class Day030_Phase1MixedChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int num = sc.nextInt();

        // Calculate factorial
        long factorial = 1;

        for (int check_num = 1; check_num <= num; check_num++) {
            factorial = factorial * check_num;
        }

        System.out.println("Factorial: " + factorial);

        // Check prime
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            for (int test_num = 2; test_num < num; test_num++) {
                if (num % test_num == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        // Print right triangle pattern
        System.out.println("Star Pattern:");

        for (int row = 1; row <= num; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
