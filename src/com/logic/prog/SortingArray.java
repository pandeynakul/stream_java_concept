package com.logic.prog;

/* Created by Ankul Deshpande on 22-05-2026 13:17 */

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 9};
        descendingOrder(arr);
        ascendingOrder(arr);

    }

    private static void ascendingOrder(int[] arr) {
        System.out.printf("sort the array by ascending order\n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void descendingOrder(int[] arr) {
        System.out.printf("sort the array by descending/reverse order\n");
        //convert int[] int Integer[]
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr, Collections.reverseOrder());
        for (int i = 0; i < boxedArr.length; i++) {
            System.out.println(boxedArr[i]);
        }
        System.out.println(Arrays.toString(boxedArr));

    }
}
