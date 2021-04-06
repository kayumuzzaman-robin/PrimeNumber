package learn.java;

import java.util.Scanner;

/**
 * Find Prime Number
 * If input is not an int value, it will ask for the input again
 * If input is an int, isPrime() method will be called
 * & check if it is a prime or not and give the result and terminate the program
 */
public class App {

    public static boolean isPrime(int number) {
        if (number == 1 || number == 2) {
            return false;
        } else if (number > 2) {
            for (int i = 3; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Find prime number, input a number to check: ");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input, try again!");
            scanner.next();
        }

        int input = scanner.nextInt();
        System.out.println("Result of isPrime() = " + isPrime(input));

    }
}
