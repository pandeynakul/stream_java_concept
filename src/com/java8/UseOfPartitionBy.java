package com.java8;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseOfPartitionBy {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 12, 7, 8, 9, 11};
        //sperate the even and odd
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Map<Boolean, List<Integer>> partition = list.stream().collect(Collectors.partitioningBy(c -> c % 2 == 0));
        System.out.println("Even");
        System.out.println(partition.get(true));
        System.out.println("odd");
        System.out.println(partition.get(false));

        //with the help of grouping by clause:


    }
}
