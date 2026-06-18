package com.logic.prog;


/* Created by Ankul Deshpande on 11-05-2026 04:44 */
//factorial
public class Recursion {

    public static void main(String[] args) {
        //4!=4*3!
        //3!=3*2!
        //2!=2*1!
        //n!=n*(n-1)!--<Expression>

        //base case
        int n = 4;
        int factorial = fib(n);
        System.out.println("factorial by recursion : " + factorial);

    }

    private static int fib(int n) {
        //base case
        if (n == 1)
            return 1;
        return n * fib(n - 1);

    }
}
