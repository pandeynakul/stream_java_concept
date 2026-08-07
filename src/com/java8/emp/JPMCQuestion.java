package com.java8.emp;

/* author :  Ankul Deshpande */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JPMCQuestion {
    public static void main(String[] args) {
        //linked hash map is important to for insertion order maintain:
        String input = "nbearablepainthautNeveEnd";
        Map<Character, Long> countChar = input.chars().mapToObj(s -> Character.toLowerCase((char) s)).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(countChar);

        System.out.println("final  find first non repeated character:");
        Character cd = input.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c))).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
                entrySet().stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey()).findFirst().get();
        System.out.println(cd);
    }
}
