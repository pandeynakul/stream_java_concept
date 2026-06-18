package com.app.java8;

/* Created by Ankul Deshpande on 06-06-2026 00:58 */

import java.util.Arrays;

public class RemoveDupleFromSortedArray {


    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 4, 5, 6,};
        int k = removeDupleFromSortedArray(arr);
        System.out.println(k);
        System.out.println(Arrays.toString(arr));

    }

    private static int removeDupleFromSortedArray(int[] arr) {
        int[] unique = Arrays.stream(arr).distinct().toArray();

        for (int i = 0; i < unique.length; i++) {
            arr[i] = unique[i];
        }
        return unique.length;

    }
}
