package com.ss;

/* Created by Ankul Deshpande on 10-06-2026 12:57 */

import java.util.Scanner;

public class StringBasedFibCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for calculating Fibonacci ");
        int n = sc.nextInt();
        String total = stringBasedFibCalculator(n);
        System.out.println(total);

    }

    private static String stringBasedFibCalculator(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        String prev1 = "0", prev2 = "1";
        for (int i = 2; i <= n; i++) {

            String sum = addStringFib(prev1, prev2);
            //swap it:
            prev1 = prev2;
            prev2 = sum;


        }
        return prev2;
    }

    private static String addStringFib(String prev1, String prev2) {

        int carry = 0;
        int n1 = prev1.length() - 1;
        int n2 = prev2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            //find the digit: ternary
            int digit1 = (n1 >= 0) ? prev1.charAt(n1) - '0' : 0;

            //with if
            int digit2;
            if (n2 >= 0) {
                digit2 = prev2.charAt(n2) - '0';
            } else {
                digit2 = 0;
            }


            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            //right to left
            n1--;
            n2--;
        }


        return sb.reverse().toString();
    }
}
