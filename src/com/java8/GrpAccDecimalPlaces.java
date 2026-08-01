package com.java8;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrpAccDecimalPlaces {
    public static void main(String[] args) {
        int[] arr = {98, 88, 77, 73, 97, 85, 12, 32, 75};
        //convert into the list
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer, List<Integer>> map = list.stream().
                collect(Collectors.groupingBy(x -> x / 10 * 10, Collectors.toList()));
        System.out.println(map);

        //Separate the integer from string list
        String[] sarr = {"123", "ankul", "jai", "456", "rakul", "342"};
        List<Integer> collect = Arrays.stream(sarr).filter(x -> x.matches("[0-9]+")).
                map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(collect);

    }
}
