package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Check Prime Number
 * Description: Read a number and determine whether it is prime.
 * Pseudocode:
    input(num);
    is_prime = true

    if num <= 1:
      is_prime = false
    else:
      for i = 2; i < num; i++:
        if num % i == 0:
          is_prime = false
          break

    if is_prime:
      print("Prime")
    else:
      print("Not Prime")
 */

// ---- Program ----

public class Day021_CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
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

        sc.close();

	}

}
