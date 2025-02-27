package practice;

import java.util.Scanner;

public class RowColsum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter [" + i + "][" + j + "] :");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        int totalRowSum = 0;
        int totalColSum = 0;

        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
                rowSum += matrix[i][j];
            }
            System.out.println("Row Sum:- " + rowSum);
            totalRowSum += rowSum;
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < row; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column Sum:- " + colSum);
            totalColSum += colSum;
        }

        System.out.println("\nTotal Row Sum:- " + totalRowSum);
        System.out.println("Total Column Sum:- " + totalColSum);
        System.out.println("\nRow Sum + Column Sum:- " + (totalRowSum + totalColSum));
    }
}







