package com.java8;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.Comparator;

public class SortTheArray {
    public static void main(String[] args) {
        int[] arr = {7, 6, 1, 2, 3, 4, 5};
        Arrays.stream(arr).sorted().forEach(x -> System.out.print(x + " "));
        System.out.println("\nDescending:");
        Arrays.stream(arr).mapToObj(x -> x)
                .sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
    }
}
