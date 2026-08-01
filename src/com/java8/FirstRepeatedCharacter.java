package com.java8;

/* author :  Ankul Deshpande */

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String input = "Helow word";
        char ch = input.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(c -> c.getValue() > 1).
                map(c -> c.getKey()).findFirst().get();
        System.out.println("FirstRepeatedCharacter: " + ch);
    }
}
