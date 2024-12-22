package it201;

public class q2 {
    public static void main(String[] args) {
        int limit = 10;
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