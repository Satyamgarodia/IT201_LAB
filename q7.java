package it201;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}
