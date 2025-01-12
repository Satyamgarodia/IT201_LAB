package riyab;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Initial value: " + num);

        num++;
        System.out.println("After increment: " + num);

        num--;
        System.out.println("After decrement: " + num);
    }
}