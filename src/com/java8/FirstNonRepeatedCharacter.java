package com.java8;

/* author :  Ankul Deshpande */


import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "eettcode";
        //Intstream of character
        Character i = input.chars().
                //convert to character
                        mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting())).
                entrySet().stream()
                .filter(x -> x.getValue() == 1).
                map(x -> x.getKey()).findFirst().orElse(null);
        System.out.println(i);

    }
}
