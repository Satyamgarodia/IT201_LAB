package riyab;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the Fibonacci series: ");
        int limit = scanner.nextInt();
        scanner.close();

        int first = 0, second = 1;

        System.out.print("Fibonacci series up to " + limit + ": ");
        for (int i = 0; i < limit; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}