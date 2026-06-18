package com.app.java8;

/* Created by Ankul Deshpande on 15-05-2026 11:30 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord2 {
    //reverse the word but dont reverse the statement in java 8
    public static void main(String[] args) {
        String statement = "nothing is impossible";
        String[] sar = statement.split(" ");
        List<String> revS = Arrays.stream(sar).map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(revS);
        revS.forEach((x) -> System.out.print(x + " "));
    }

}
