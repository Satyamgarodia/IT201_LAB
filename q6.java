package it201;

public class q6 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 50:");

        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}