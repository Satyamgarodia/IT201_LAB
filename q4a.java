package riyab;

import java.util.Scanner;

public class q4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int userInput = scanner.nextInt();
        final int constantValue = userInput;
        System.out.print("The final variable value is: " + constantValue);
        scanner.close();
    }
}