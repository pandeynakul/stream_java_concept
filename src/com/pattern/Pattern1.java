package com.pattern;

import java.util.Scanner;

/* Created by Ankul Deshpande on 02-06-2026 20:15 */
//things brush up:
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for process!!");
        int n = sc.nextInt();
        //print the pattern
        printRowCol(n);
        System.out.println();
        printRowCol2(n);
        System.out.println();
        printRowCol3(n);
        System.out.println();
        printRowCol4(n);
        System.out.println();
        printRowCol5(n);
        System.out.println();
        printRowCol6(n);

    }


    private static void printRowCol(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printRowCol2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                //as number of row increased, parallelly number of col also increased
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printRowCol3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                //printing row index
                System.out.print(row);
            }
            System.out.println();
        }
    }

    private static void printRowCol4(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                //printing the col index
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void printRowCol5(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void printRowCol6(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
