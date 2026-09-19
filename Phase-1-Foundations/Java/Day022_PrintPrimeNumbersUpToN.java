package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Print Prime Numbers up to N
 * Description: Read N and print all prime numbers from 2 to N.
 *
 * Pseudocode:

    input(num);

    for number = 2; number <= num; number++:
      is_prime = true

      for i = 2; i < number; i++:
        if number % i == 0:
          is_prime = false
          break

      if is_prime:
        print(number)
 */

// ---- Program ----

public class Day022_PrintPrimeNumbersUpToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int number = 2; number <= num; number++) {

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }

        sc.close();

	}

}
