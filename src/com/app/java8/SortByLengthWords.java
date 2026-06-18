package com.app.java8;

/* Created by Ankul Deshpande on 21-05-2026 17:09 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLengthWords {
    public static void main(String[] args) {

        System.out.println("as the list input:");
        List<String> list = Arrays.asList("ankul", "lio", "rh", "kantari", "sam", "rahulwan");
        List<String> sortByLenth = list.stream().sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sortByLenth);

        System.out.println("------*this is by lenght of string as array input :*------");
        String[] arr={"ankul", "lio", "rh", "kantari", "sam", "rahulwan"};
        List<String> inputArrayList = Arrays.stream(arr).sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(inputArrayList);
    }
}
