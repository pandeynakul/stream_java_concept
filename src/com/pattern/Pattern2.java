package com.pattern;

/* Created by Ankul Deshpande on 02-06-2026 20:36 */

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for process!!");
        int n = sc.nextInt();
        //print the pattern
        printRowColWithSpaces1(n);
        System.out.println();
        printRowColWithSpaces2(n);
        System.out.println();
        printRowColWithSpaces3(n);
        System.out.println();
        printRowColWithSpaces4(n);
        System.out.println();
        printRowColWithSpaces5(n);
        System.out.println();
    }


    private static void printRowColWithSpaces1(int n) {
        //for row:
        for (int i = 0; i < n; i++) {

            //for spaces
            for (int k = n - 1; k >= i; k--) {
                System.out.print("*");
            }
            //for col
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void printRowColWithSpaces2(int n) {
        //for row:
        for (int i = 0; i < n; i++) {

            //for spaces
            for (int k = n - 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void printRowColWithSpaces3(int n) {
        for (int i = 0; i < n; i++) {
            //for space
            for (int s = n - 1; s >= i; s--) {
                System.out.print(" ");
            }
            //for col
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void printRowColWithSpaces4(int n) {

        System.out.printf("---------------------------------------//");

        for (int i = 0; i <= n; i++) {

            //for space
            for (int s = n - 1; s >= i; s--) {
                System.out.print(" ");
            }
            //for col
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            //for col
            for (int l = 1; l < i; l++) {
                System.out.print("*");

            }
            System.out.print(" = " + (2 * i - 1));

            System.out.println();

        }

    }

    private static void printRowColWithSpaces5(int n) {

        System.out.printf("------------optimize with reduce the one loop-------------//");

        for (int i = 0; i <= n; i++) {

            //for space
            for (int s = n - 1; s >= i; s--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("=" + (2 * i - 1));
            System.out.println();
        }
    }

}
