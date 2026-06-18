package com.logic.prog;

/* Created by Ankul Deshpande on 26-05-2026 03:25 */

import java.util.Scanner;

//199=1+9+9=19
//1+9=10
//523 magic
//421 is not magic number
public class MagicalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number !!");
        long n = sc.nextLong();

        //print the sum of digit
        long sum = 0, rem = 0;
        //save the num be temp for the operation
        long temp = n;


        while (temp > 0 || sum >= 9) {
            //repeat the process to add the reminder again
            //unless and until the sum is single digit
            if (temp == 0) {
                temp = sum;
                sum = 0;
            }
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;

        }
        if (sum == 1) {
            System.out.println(n + " magic number");
        } else {
            System.out.println(n + " NOT an magic Number!");
        }
    }
}
