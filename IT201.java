package it201;

import java.util.Scanner;

public class IT201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== IT201 Menu ===");
            System.out.println("1. Check whether a number is prime");
            System.out.println("2. Print a Fibonacci series up to a limit");
            System.out.println("3. Check whether a number is even or odd");
            System.out.println("4. Check if an input character is vowel or consonant");
            System.out.println("5. Check whether a year is a leap year");
            System.out.println("6. Print all prime numbers from 1 to 50");
            System.out.println("7. Calculate power of a number");
            System.out.println("8. Display grade of students");
            System.out.println("9. Check whether two strings are equal or not");
            System.out.println("10. Display numbers using increment and decrement operators");
            System.out.println("11. Find greater number using ternary operator");
            System.out.println("12. Reverse a given number");
            System.out.println("13. Show method overloading");
            System.out.println("14. Show method overriding");
            System.out.println("15. Show single-level inheritance");
            System.out.println("16. Show multi-level inheritance");
            System.out.println("17. Show hierarchical inheritance");
            System.out.println("18. Show hybrid inheritance");
            System.out.println("19. Multiple inheritance through interfaces in a class");
            System.out.println("20. Multiple inheritance through interfaces extended by another interface");
            System.out.println("21. MotorBike and Cycle interfaces implementation");
            System.out.println("22. Use of final variables");
            System.out.println("23. Use of final methods");
            System.out.println("24. Use of final classes");
            System.out.println("25. Input and print 1-D arrays");
            System.out.println("26. Multiply two 2-D arrays");
            System.out.println("27. Pass array as parameter");
            System.out.println("28. Method returning an array");
            System.out.println("29. String class inbuilt methods");
            System.out.println("30. StringBuilder class inbuilt methods");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> q1.main(args);
                case 2 -> q2.main(args);
                case 3 -> q3.main(args);
                case 4 -> q4.main(args);
                case 5 -> q5.main(args);
                case 6 -> q6.main(args);
                case 7 -> q7.main(args);
                case 8 -> q8.main(args);
                case 9 -> q9.main(args);
                case 10 -> q10.main(args);
                case 11 -> q11.main(args);
                case 12 -> q12.main(args);
                case 13 -> q13.main(args);
                case 14 -> q14.main(args);
                case 15 -> q15.main(args);
                case 16 -> q16.main(args);
                case 17 -> q17.main(args);
                case 18 -> q18.main(args);
                case 19 -> q19.main(args);
                case 20 -> q20.main(args);
                case 21 -> q21.main(args);
                case 22 -> q22.main(args);
                case 23 -> q23.main(args);
                case 24 -> q24.main(args);
                case 25 -> q25.main(args);
                case 26 -> q26.main(args);
                case 27 -> q27.main(args);
                case 28 -> q28.main(args);
                case 29 -> q29.main(args);
                case 30 -> q30.main(args);
                case 0 -> System.out.println("Exiting the program...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
