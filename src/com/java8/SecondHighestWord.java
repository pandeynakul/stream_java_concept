package com.java8;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestWord {

    public static void main(String[] args) {

        String input = "Hello Java 8 jai shree swami samarth jai shree swami samrth";
        //print the length of the 2nd highest word
        Integer i = Arrays.stream(input.split(" ")).map(String::length).
                sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);

        //print the word
        String word = Arrays.stream(input.split(" ")).
                sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(word);


    }
}
