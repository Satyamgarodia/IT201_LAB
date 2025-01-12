package riyab;

import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matrices (rows and columns): ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid matrix size. Please enter positive integers.");
            return;
        }

        int[][] matrix1 = new int[rows][cols], matrix2 = new int[rows][cols], result = new int[rows][cols];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices cannot be multiplied. Please check the dimensions.");
            return;
        }

        System.out.println("Multiplying matrices...");
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                for (int k = 0; k < cols; k++) 
                    result[i][j] += matrix1[i][k] * matrix2[k][j];

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int val : row) 
                System.out.print(val + " ");
            
            System.out.println();
        }
    }
}