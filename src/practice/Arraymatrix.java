package practice;

import java.util.Scanner;

public class Arraymatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter [" + i + "][" + j + "] :");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "  ");
                rowSum += matrix[i][j];
            }
            System.out.println("Row Sum:- " + rowSum);
        }
    }
}

































































