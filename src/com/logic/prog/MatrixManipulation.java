package com.logic.prog;

import java.util.Scanner;

public class MatrixManipulation {

    //client :

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int r = sc.nextInt();
        System.out.println("Enter the col");
        int c = sc.nextInt();

        //build the matrix
        buildMatrix(r, c);
    }

    //build the matrix for array reversal
    private static void buildMatrix(int r, int c) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        //enter the row and col
        int[][] values = new int[r][c];
        for (int i = 0; i < r; i++) {
            System.out.println("Enter " + i + " row values");
            for (int j = 0; j < c; j++) {
                values[i][j] = sc.nextInt();

            }

        }
        System.out.println("original Arrays");
        for (int x = 0; x < values.length; x++) {
            for (int y = 0; y < values.length; y++) {
                System.out.print(values[x][y] + " ");
            }
            System.out.println();
        }
        //pass the array to function for reversal
        //or values at its own place
        reverseArray(values);
    }

    //reverse the array and print it::
    private static void reverseArray(int[][] values) {
        //create an new array to save the the reverse number
        int revNum[][] = new int[values.length][values[0].length];

        //reverse the number
        /*You declared reverse outside the inner loop and never reset it for each element.

        So after the first reversal, subsequent numbers keep appending digits to the old result.

        Fix: Reset reverse = 0; inside the loop before starting reversal for each element
        That only works for square matrices. If your matrix has different row/column counts, this will break.
        Correct:
        int revNum[][] = new int[values.length][values[0].length];
        //while iterating also u need to remember that

        */

        for (int i = 0; i < values.length; i++) {

            for (int j = 0; j < values[i].length; j++) {

                int num = values[i][j];
                //reset it for each element
                int reverse = 0;
                //provide the reverse number logic
                //this shoul be the different method or
                while (num != 0) {
                    //find the digit
                    int digit = num % 10;
                    //build the reverse number
                    reverse = reverse * 10 + digit;
                    //remove the last digit
                    num = num / 10;

                }
                //
                revNum[i][j] = reverse;

            }

        }


        //print the revese array
        System.out.println("reverse  Arrays");
        for (int x = 0; x < revNum.length; x++) {
            for (int y = 0; y < revNum[x].length; y++) {
                System.out.print(revNum[x][y] + " ");
            }
            System.out.println();
        }

    }


}
