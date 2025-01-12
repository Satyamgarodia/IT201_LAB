package riyab;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean isPrime = isPrimeNumber(num);

        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2, sqrt = (int) Math.sqrt(num); i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}