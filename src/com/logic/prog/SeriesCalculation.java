package com.logic.prog;

import java.util.Scanner;

/* Created by Ankul Deshpande on 11-05-2026 02:54 */
//term
//x^2/2! + 2x^4/4! -3x^6/6! +4^8/8!-.....nx^(2*n)/n!

public class SeriesCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of calculations:");
        int n = sc.nextInt();
        System.out.println("Enter the base of calculations:");
        int x = sc.nextInt();
        //initial sign
        int sign = -1;
        //perform the operation
        // double output = n * x ^ (2 * n) / fact(n);
        //series should be calculated
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sign *= -1;
            // sum += i * x ^ (2 * i) / fact(2*i);
            double term = i * Math.pow(x, 2 * i) / fact(2 * i);
            term = sign * term;
            sum += term;

        }

        System.out.println("The result is: " + sum);
    }

    //calculate the factorial
    private static int fact(int n) {


        //4!=4321
        //loop wisr
      /*  int fact = 1;
        //4!=4*3*2*1
        for (int i = n; i >= 1; i--) {
            //calculate the fact
            fact = fact * i;
        }
        System.out.println(fact);
        return fact;*/
        //by recursion:
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

}
