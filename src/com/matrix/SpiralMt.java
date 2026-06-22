package com.matrix;

/* Created by Ankul Deshpande on 19-06-2026 11:31 */

import java.util.ArrayList;
import java.util.List;

//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
public class SpiralMt {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> result = spiralOrder1(matrix);
        //System.out.println(result);

    }

    private static List<Integer> spiralOrder1(int[][] matrix) {
        int br = 0;
        int bc = 0;
        int er = matrix[0].length - 1;
        int ec = matrix.length - 1;

        System.out.println("er : " + er);
        System.out.println("ec : " + ec);
        while (br <= er && bc <= ec) {
            //left to right
            for (int i = br; i <= er; i++) {
                System.out.println(matrix[br][i]);
            }
            br++;
            //top to bottom
            for (int i = br; i <= ec; i++) {
                System.out.println(matrix[i][er]);//[1,2][3]
            }
            er--;
            //right to left
            if(br <= er){
                for (int i = er; i >= bc; i--) {
                    System.out.println(matrix[er][i]);
                }
                ec--;
            }

            //bottom to top
            if(bc <= ec){
                for (int i = ec; i >= br; i--) {
                    System.out.println(matrix[i][bc]);
                }
                bc++;
            }


        }

        return null;
    }
}
