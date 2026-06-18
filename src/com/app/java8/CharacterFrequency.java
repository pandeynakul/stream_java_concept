package com.app.java8;

/* Created by Ankul Deshpande on 15-05-2026 11:47 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CharacterFrequency {

    public static void main(String[] args) {
        //in java 8

        String statement = "controlling the habits i think it will work!";
        Map<Character, Long> output = statement.chars().mapToObj(c -> (char) c)
                .filter(x -> Character.isLetter(x)).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        output.forEach((x, y) -> System.out.println(x + " " + y));

    }
}
