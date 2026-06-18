package com.logic.prog;

/* Created by Ankul Deshpande on 05-06-2026 04:12 */

import java.util.Scanner;

import static java.lang.Integer.reverse;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for process!!");
        int n = sc.nextInt();
        int rev = reverseInteger(n);
        System.out.println(rev);
        System.out.println("---------------------");
        if (isPalindrome(n)) {
            System.out.printf("palindrome");
        } else {
            System.out.println("not an palindrome");
        }
    }

    private static int reverseInteger(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            //find the r
            int r = temp % 10;
            //join

            //devide
            temp = temp / 10;

          /*  if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0; // Overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0; // Underflow
            }*/
            rev = rev * 10 + r;
        }
        return rev;
    }

    public static boolean isPalindrome(int x) {

        //negative number are never palindrome:
        if (x < 0) return false;
        //perform  the operation on temp;
        int temp = x;
        int rev = 0;
        while (temp != 0) {

            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;

        }

        return rev == x;

    }
}
