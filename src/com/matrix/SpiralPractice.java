package com.matrix;

/* Created by Ankul Deshpande  */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralPractice {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        //List<Integer> result = spiralOrderPractice(matrix);
        // System.out.println(result);
        int[][] result = spiralOrderPractice(3);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.println(result[i][j]);
            }
        }


    }

    private static int[][] spiralOrderPractice(int n) {
        // List<Integer> list = new ArrayList<>();
        int[][] arr = new int[n][n];
        int val = 1;

        int br = 0;
        int bc = 0;
        //  int er = matrix[0].length - 1;
        //  int ec = matrix.length - 1;
        int er = n - 1;
        int ec = n - 1;
        System.out.println("er: " + er);
        System.out.println("ec: " + ec);

        //perform the operation
        while (br <= er && bc <= ec) {
            //From left to right
            for (int i = br; i <= er; i++) {
                //System.out.println(matrix[br][i]);
                //    list.add(matrix[br][i]);
                arr[br][i] = val;
                val += 1;
            }
            br++;

            //From top to bottom
            for (int i = br; i <= ec; i++) {
                //  System.out.println(matrix[i][er]);
                // list.add(matrix[i][er]);
                arr[i][er] = val;
                val += 1;
            }
            er--;

            //From right to left -r
            if (br <= er) {
                for (int i = er; i >= bc; i--) {
                    // System.out.println(matrix[er][i]);
                    //   list.add(matrix[er][i]);
                    arr[er][i] = val;
                    val += 1;
                }
                ec--;
            }

            //From bootom to top -c
            if (bc <= ec) {
                for (int i = ec; i >= br; i--) {
                    // System.out.println(matrix[i][bc]);
                    //list.add(matrix[i][bc]);
                    arr[i][bc] = val;
                    val += 1;
                }
                bc++;
            }

        }

        return arr;

    }
}
