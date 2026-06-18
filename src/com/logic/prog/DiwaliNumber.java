package com.logic.prog;

/* Created by Ankul Deshpande on 25-05-2026 23:57 */

import java.util.Scanner;

public class DiwaliNumber {

    public static void main(String[] args) {
        //9=81=8+1=9 is magical
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number !!");
        long n = sc.nextLong();
        //perform the square operation
        long square = n * n;
        System.out.println("square of number : " + square);

        //find the length of the square:
        String cal_length = "" + square;
        System.out.println("length of the calculated square: " + cal_length.length());
        //converted into the long again
        long cal_length_for_Square = cal_length.length();
        //find the mid: if its even
        long mid;
        if (cal_length_for_Square % 2 == 0) {
            mid = cal_length_for_Square / 2;
        } else {
            mid = (cal_length_for_Square / 2) + 1;
        }
        System.out.println("mid for square number : " + mid);

        //convert into the long
        long square_num = Long.parseLong(cal_length);
        System.out.println("square_num " + square_num);

        //before that make the power to which its divisible like 100/1000/10000
        //to get the required to be left and right part for the number
        //book in left and right:
        //right is bigger if odd number

        long divisor = (long) Math.pow(10, mid);
        //divide by number to get left and right:
        long left = square_num / divisor;
        long right = square_num % divisor;
        System.out.println("left number : " + left);
        System.out.println("right number : " + right);

        if (left + right == n) {
            System.out.println(n + " is Diwali");
        } else {
            System.out.println(n + " Not an  Diwali Number");
        }


    }
}
