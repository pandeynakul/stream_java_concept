package com.java8;

/* author :  Ankul Deshpande */

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Hellow word";
        input.chars().mapToObj(c -> (char) c).distinct().
                forEach(x -> System.out.print(x));
        System.out.println("\n *==*");
        Arrays.stream(input.split("")).distinct().forEach(x -> System.out.print(x));
    }
}
