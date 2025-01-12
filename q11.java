package riyab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = getNumberInput(sc, "Enter first number: ");
        int num2 = getNumberInput(sc, "Enter second number: ");

        int greater = Math.max(num1, num2);
        System.out.println("Greater number is: " + greater);
    }

    private static int getNumberInput(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear invalid input
            }
        }
    }
}