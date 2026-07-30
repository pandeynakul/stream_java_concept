package com.java8;

/* author :  Ankul Deshpande */

import java.util.stream.IntStream;

public class PalindromeInjava8 {
    public static void main(String[] args) {
        String input = "121";
        input.toLowerCase();
        boolean isPal = IntStream.range(0, input.length() / 2).
                allMatch(c -> input.charAt(c) == input.charAt(input.length() - c - 1));
        System.out.println(isPal);

    }
}
