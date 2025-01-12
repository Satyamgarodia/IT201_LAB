package riyab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q13 {
    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public String add(String a, String b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int a = getIntegerInput(scanner, "Enter first integer:");
        int b = getIntegerInput(scanner, "Enter second integer:");
        System.out.print("Addition of integers: " + calc.add(a, b) + "\n");

        double c = getDoubleInput(scanner, "\nEnter first double:");
        double d = getDoubleInput(scanner, "Enter second double:");
        System.out.print("Addition of doubles: " + calc.add(c, d)+ "\n");

        String e = getStringInput(scanner, "\nEnter first string:");
        String f = getStringInput(scanner, "Enter second string:");
        System.out.print("Addition of strings: " + calc.add(e, f)+ "\n");
    }

    private static int getIntegerInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
    }

    private static double getDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a double.");
                scanner.next();
            }
        }
    }

    private static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
}