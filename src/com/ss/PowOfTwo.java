package com.ss;

/* Created by Ankul Deshpande on 11-06-2026 07:09 */

import java.util.Scanner;

public class PowOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int value = sc.nextInt();
        boolean isPowOf2 = isPowerOfTwo(value);
        System.out.println(isPowOf2);
    }

    private static boolean isPowerOfTwo(int n) {
        // A power of two must be positive
        if (n <= 0) return false;

        // Key trick: n & (n - 1) == 0 only for powers of two
        return (n & (n - 1)) == 0;
    }


}
