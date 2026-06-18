package com.logic.prog;

/* Created by Ankul Deshpande on 21-05-2026 08:24 */

import java.util.Scanner;

public class DudleyNumber {
    public static void main(String[] args) {
        //cube root =sum of digit are same
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number!");
        int num = sc.nextInt();

        //find the cuber root of number:
        int cbrt = (int) Math.round(Math.cbrt(num));
        System.out.println("cbrt " + cbrt);
        //find the cube:
        int cube = cbrt * cbrt * cbrt;
        System.out.println("cube : " + cube);

        //check whether its an perfect cube or not
        if (num > 0 && num == cube) {
            //find the sm of digit
            int digitSum = sumOfDigit(num);
            System.out.println("digitSum " + digitSum);
            //compare the cbe and sumof digit
            if (cbrt == digitSum) {
                System.out.println(num + " Dudley number");
            }
        } else {
            System.out.println(num + " not perfect cube or not Dudley");
        }


    }

    private static int sumOfDigit(int num) {
        int temp = num;
        int sum = 0;
        //when nnumber != zero
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem;
            //operation should be performed on temp
            temp = temp / 10;

        }
        return sum;
    }
}
