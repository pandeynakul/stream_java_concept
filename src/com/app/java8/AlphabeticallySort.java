package com.app.java8;

/* Created by Ankul Deshpande on 22-05-2026 11:25 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticallySort {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("ankul", "lio", "rh", "bee", "kantari", "zebra", "sam", "rahulwan");
        List<String> sort = list.stream().sorted(Comparator.naturalOrder()).
                collect(Collectors.toList());
        System.out.println(sort);
        System.out.println();
        System.out.println("----* find the last element from the list: *----");
        String lastWord = list.stream().skip(list.size() - 1).findFirst().get();
        System.out.println("last element from the list - " + lastWord);
    }
}
