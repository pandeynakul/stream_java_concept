package com.java8;

/* author :  Ankul Deshpande */

import java.io.InputStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringStatement {
    public static void main(String[] args) {
        String input = "Hello Java 8";
        String reverse = IntStream.range(0, input.length()).mapToObj(c -> input.charAt(input.length() - 1 - c)).
                map(String::valueOf).collect(Collectors.joining());
        System.out.println(reverse);
    }
}
