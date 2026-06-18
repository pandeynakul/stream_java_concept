package com.ss;

/* Created by Ankul Deshpande on 10-06-2026 09:51 */

public class ReverseNum {
    public static void main(String[] args) {
        int n = 12328;
        while (n != 0) {
            int reminder = n % 10;
            n = n / 10;
            System.out.print(reminder);
        }
    }
}
