package Phase_2_foundations;

import java.util.Scanner;

/**
 * Headline: Function to Find Square
 * Description: Write a function that takes a number
 * and returns its square.
 *
 * Pseudocode:
 * Define function findSquare(num):
 *
 *   square = num * num
 *   return square
 *
 * Read num
 *
 * Call findSquare(num)
 * Store the returned value
 *
 * Print the square
 */

// ---- Program ----

public class Day036_FunctionToFindSquare {
	
	static int findSquare(int num) {
        int square = num * num;
        return square;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = findSquare(num);
        System.out.println("Square: " + result);
        
        sc.close();
	}
}
