package com.app.java8;

/* Created by Ankul Deshpande on 28-05-2026 15:28 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConvertingArrays {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2,2, 9};

        // Boxing: int[] → Integer[]
        Integer[] boxedArray = Arrays.stream(arr).boxed().
                toArray(Integer[]::new);

        // Unboxing: Integer[] → int[]
        int[] array = Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();

        int primitive = 42;
        // Boxing (int → Integer)
        Integer boxed = Integer.valueOf(primitive);
        // Unboxing (Integer → int)
        int unboxed = boxed.intValue();
        System.out.println("Primitive: " + primitive);
        System.out.println("Boxed: " + boxed);
        System.out.println("Unboxed: " + unboxed);

        long count = Arrays.stream(arr).distinct().boxed().mapToInt(Integer::intValue).count();
        System.out.println((int)count);
    }
}
