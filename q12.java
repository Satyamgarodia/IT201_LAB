package riyab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = getValidInput(sc);

        int reversed = reverseNumber(num);

        System.out.println("Reversed number: " + reversed);
    }

    private static int getValidInput(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter a number: ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // Clear invalid input
            }
        }
    }

    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}