package com.app.java8;

/* Created by Ankul Deshpande on 25-05-2026 15:03 */

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfDigit {
    public static void main(String[] args) {
        int value = 12345;
        String inToString = String.valueOf(value);
        System.out.println("Converted to string from primitive- " + inToString);
        Integer convToWrapper = Integer.valueOf(value);
        System.out.println("Converted to string from wrapper- " + convToWrapper);
        int convToPrimitive = convToWrapper.intValue();
        System.out.println("converted to primitive from wrapper-" + convToPrimitive);
        int i = Integer.parseInt(inToString);
        System.out.println("-----------------");
        int sum = Arrays.stream(String.valueOf(value).split(""))
                .mapToInt(Integer::parseInt).sum();
        System.out.println("sum : " + sum);
        System.out.println("-----------------");
        int summ = 0;

        while (value > 0) {
            int digit = value % 10;
            summ += digit;
            value = value / 10;
        }
        System.out.println(":with whole logic: " + summ);

    }
}
