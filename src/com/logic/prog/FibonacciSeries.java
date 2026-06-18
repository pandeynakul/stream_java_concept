package com.logic.prog;

import java.util.Scanner;

//with recursion
public class FibonacciSeries {
    //0,1,1,2,3,5...
    //we need to calaculate the express
    //((n-1)+n)
    //find the fib(5)=fib(4)+fib(3)
    //fib(4)=fib(3)+fib(2)
    //fib(3)=fib(2)+fib(1)
    //fib(2)=fib(1)+fib(0)
    //final Expression will be::
    //fib(n)=fib(n-1)+fib(n-2)
    //if base case n=0;
    // else if (n==1) return 1
    //else calculate series
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc;
        int i;
        int j;
        int value;
        System.out.println("welcome to console!!");
        loop1:
        do {
            System.out.println("please Enter the choose ");
            System.out.println("1 For calculate fb series!! ");
            System.out.println("2 for exit the process!! ");
            sc = new Scanner(System.in);
            i = sc.nextInt();
            switch (i) {
                case 1 -> {
                    System.out.println("enter the number for Fibonacci series");
                    int k = sc.nextInt();
                    for (j = 0; j <= k; j++) {
                        value = calculateFib(j);
                        System.out.println(value + ",");
                    }
                }
                case 2 -> System.exit(0);
            }
            System.out.println("Do you want to continue(y/n)");
            String choice = sc.next();
            if (choice.equals("y")) {
                continue loop1;
            } else {
                flag = false;
            }
        } while (flag);


    }

    public static int calculateFib(int i) {
        //base case

        if (i == 0 || i == 1) {
            return i;

        } else
            //calculate number
            return calculateFib(i - 1) + calculateFib(i - 2);
    }


}
