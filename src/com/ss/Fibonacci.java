package com.ss;

/* Created by Ankul Deshpande on 10-06-2026 11:43 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to Find fib series total");
        int value = sc.nextInt();
        int total = fibCalculate(value);
        System.out.println(total);

    }

    //perform the operation:
    private static int fibCalculate(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int prev = 0, prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int sum = prev + prev1;
            prev = prev1;
            prev1 = sum;
        }

        return prev1;
    }
}
