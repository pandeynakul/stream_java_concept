package com.java8;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapStringLen {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "kela", "kiwi");
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(f -> f,//key
                String::length,//value
                (e, d) -> e//if there is duplicates
        ));
        System.out.println(map);
    }
}
