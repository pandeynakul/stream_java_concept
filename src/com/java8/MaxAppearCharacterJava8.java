package com.java8;

/* author :  Ankul Deshpande */

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxAppearCharacterJava8 {
    public static void main(String[] args) {
        String input = "eettcodett";
        Character c1 = input.chars()//instream
                .mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(c -> c.getKey()).get();

        System.out.println(c1);
    }
}
