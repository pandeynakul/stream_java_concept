package com.logic.prog;

/* Created by Ankul Deshpande on 13-05-2026 16:22 */

//print the four-digit number whose first half^2
// and second half^2  addition is number itself

public class SpecialTwoDigitNumber {

    public static void main(String[] args) {

        for (int i = 1000; i < 9999; i++) {
            //Numbner pass it to the user defined function
            checkSpe4DigitNum(i);
        }
    }

    private static void checkSpe4DigitNum(int i) {
        //divid the number by 100 to get the reminder and quotient
        //to get the first half and second  half of the 4-digit  number
        int f = i % 100;
        int l = i / 100;
        int output = (int) Math.pow(f + l, 2);
        if (output == i) {
            System.out.println(output);
        }
    }
}
