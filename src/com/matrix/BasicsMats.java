package com.matrix;

/* Created by Ankul Deshpande on 18-06-2026 16:28 */

public class BasicsMats {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4},//row 0
                {5, 6, 7, 8},//row 1
                {9, 10, 11, 12} //row 2
        };

        //find the number of rows
        System.out.println("matrix rows::" + matrix.length);
        System.out.println("matrix columns::" + matrix[0].length);

        //pass it to the method:
        printOrder(matrix);

    }

    private static void printOrder(int[][] matrix) {
        int right = matrix[0].length - 1;
        int row = 0;
        //print the first row
        for (int i = row; i <= right; i++) {
            System.out.println(matrix[row][i]);
        }
    }
}
