package com.logic.prog;

/* Created by Ankul Deshpande on 18-05-2026 10:44 */

import java.util.Scanner;

//largest number which devide the both number : HCF/GCD
//there is one more method from which we could find the HCF that is ecludian:
public class GCDCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr the two Number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //pass it to the function:
        calculateGCD(a, b);
        calculateGCDbyRecursion(a, b);
    }

    private static void calculateGCDbyRecursion(int a, int b) {

        //base case : smaller value become zero

        if (a == 0) {
            System.out.println("Gcd by Recursion "+b);
        } else {
            calculateGCDbyRecursion(b % a, a);

        }
    }


    private static void calculateGCD(int a, int b) {
        //find the minimum

        int min = a < b ? a : b;
        //process the loop
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("GCD or HCF : " + i);
                //once you find the hcf break the loop
                //we dont want to continue
                //loop are in the reverse order
                //hcf is min or less than min
                break;

            }

        }

    }
}
