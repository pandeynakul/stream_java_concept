package com.matrix;

/* Created by Ankul Deshpande  */

public class diagonalSumMtx {

    public static void main(String[] args) {
        //square matrix
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        int diagSum = diagonalSum(mat);
        System.out.println("diagSum = " + diagSum);
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int diagSum1 = diagonalSum(mat1);
        System.out.println("diagSum1 = " + diagSum1);
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum = sum + mat[i][i];
            sum = sum + mat[i][n - i - 1];

        }
        //for odd lenght matrix
        if (n % 2 != 0) {
            sum = sum - mat[n / 2][n / 2];
        }

        return sum;
    }
}
