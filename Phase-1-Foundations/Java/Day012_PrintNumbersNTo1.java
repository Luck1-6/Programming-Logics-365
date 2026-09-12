package Phase_1_foundations;

import java.util.Scanner;

/**
 * Headline: Print Numbers N to 1
 * Description: Read N and print integers from N down to 1.
 *
 * Pseudocode:
class Day012_PrintNumbersNTo1:
  main():
    Scanner sc = new Scanner(System.in);
    System.out.Println("Enter n: ");
    
    n = sc.nextInt()

    for i = n; i >= 1; i--:
      System.out.println(i)
 */

// ---- Program ----
public class Day012_PrintNumbersNTo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();

	}

}
