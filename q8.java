package riyab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int marks = getValidMarks(sc);

            String grade = getGrade(marks);
            System.out.println("Grade: " + grade);
        }
    }

    private static int getValidMarks(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter marks (0-100): ");
                int marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input. Please enter a number between 0 and 100.");
                } else {
                    return marks;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear invalid input
            }
        }
    }

    private static String getGrade(int marks) {
        if (marks >= 90) {
            return "A (Excellent)";
        } else if (marks >= 75) {
            return "B (Good)";
        } else if (marks >= 50) {
            return "C (Fair)";
        } else {
            return "F (Fail)";
        }
    }
}