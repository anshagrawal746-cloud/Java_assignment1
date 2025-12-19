package Assignment1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;
        System.out.print("Enter number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        // ADDITION
        System.out.println("\nAddition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(a[i][j] + b[i][j] + " ");
            System.out.println();
        }

        // SUBTRACTION
        System.out.println("\nSubtraction:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(a[i][j] - b[i][j] + " ");
            System.out.println();
        }

        // MULTIPLICATION
        if (r == c) {
            System.out.println("\nMultiplication:");
            int mul[][] = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < c; k++)
                        mul[i][j] += a[i][k] * b[k][j];
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMultiplication not possible");
        }

        // TRANSPOSE
        System.out.println("\nTranspose of first matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }

        // CHECK SQUARE MATRIX
        if (r == c)
            System.out.println("\nMatrix is Square");
        else
            System.out.println("\nMatrix is not Square");

        // CHECK DIAGONAL MATRIX
        boolean diagonal = true;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i != j && a[i][j] != 0)
                        diagonal = false;
                }
            }
            if (diagonal)
                System.out.println("Matrix is Diagonal");
            else
                System.out.println("Matrix is not Diagonal");
        }

        // CHECK IDENTITY MATRIX
        boolean identity = true;
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                        identity = false;
                }
            }
            if (identity)
                System.out.println("Matrix is Identity");
            else
                System.out.println("Matrix is not Identity");
        }
    }
}
