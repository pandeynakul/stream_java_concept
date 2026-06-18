package com.app.java8;

/* Created by Ankul Deshpande on 15-05-2026 10:43 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinAndMaxNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23, 12, 45, 34, 32, 56, 76);
       /* Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        if (!max.isEmpty()) {
            System.out.println(max);
        }*/

        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("maximum number for list: " + max);

        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("minimum number for list: " + min);
        System.out.println("******Removing the duplicates::____");
        List<Integer> list2 = Arrays.asList(23, 12, 45, 34, 32, 56, 45, 12, 76);
        List<Integer> distinct = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        System.out.println("Even number only :");
        list.stream().filter(x -> x % 2 == 0).
                forEach(x -> System.out.print(x + " "));
        System.out.println();


    }
}
