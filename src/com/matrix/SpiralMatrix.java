package com.matrix;

/* Created by Ankul Deshpande on 18-06-2026 08:14 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);

    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        //four variable
        int left = 0;
        int right = matrix[0].length - 1;
        int row = 0;
        int bottom = matrix.length - 1;

        ArrayList result = new ArrayList();
        //should be left <=right
        //top <=bottom check in between also after two for loop iteration
        while (left <= right && row <= bottom) {

            System.out.println("iterate the left to right:");
            for (int i = left; i <= right; i++) {
                //fix the row nad move column
                System.out.println(matrix[row][i]);
                result.add(matrix[row][i]);
            }
            row++;
            System.out.println("row  : " + row);
            System.out.println("Traverse from Top → Bottom");

            // Traverse from Top → Bottom
            for (int j = row; j <= bottom; j++) {
                System.out.println(matrix[j][right]);
                result.add(matrix[j][right]);
            }
            //decrease the length of row
            right--;
            System.out.println(" Traverse from Right → Left (if still valid)");
            if (row <= bottom) {
                for (int k = right; k >= left; k--) {
                    System.out.println(matrix[bottom][k]);
                    result.add(matrix[bottom][k]);
                }
            }
            bottom--;
            System.out.println(" Traverse from Bottom → Top (if still valid)");
            if (left <= right) {
                for (int i = bottom; i >= row; i--) {
                    System.out.println(matrix[i][left]);
                    result.add(matrix[i][left]);
                }
                left++;
            }


        }

        return result;
    }

}
