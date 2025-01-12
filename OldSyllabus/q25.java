package riyab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getArraySize(sc);
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = getIntegerInput(sc, "Enter element " + (i + 1) + ": ");
        }

        System.out.println("The elements of the array are:");
        printArray(array);

        sc.close();
    }

    private static int getArraySize(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter the size of the array (1-100): ");
                int n = sc.nextInt();
                if (n < 1 || n > 100) {
                    System.out.println("Array size must be between 1 and 100.");
                } else {
                    return n;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
            }
        }
    }

    private static int getIntegerInput(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
            }
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}