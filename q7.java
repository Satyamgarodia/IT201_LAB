package riyab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = getIntegerInput(sc, "Enter base: ");
        int exponent = getIntegerInput(sc, "Enter exponent: ");

        int result = power(base, exponent);
        System.out.println("Result: " + result);
    }

    private static int getIntegerInput(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear invalid input
            }
        }
    }

    private static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}