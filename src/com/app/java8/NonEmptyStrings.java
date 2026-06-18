package com.app.java8;

/* Created by Ankul Deshpande on 15-05-2026 10:15 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NonEmptyStrings {

    public static void main(String[] args) {
        //find the non-empty string:
        List<String> input = Arrays.asList("", "ankul", "", "deshpande", "", "techlead", "hcltech");
        long y = input.stream().filter(x -> !x.isEmpty()).count();
        System.out.println("non-Empty : " + y);
        long z = input.stream().filter(x -> x.isEmpty()).count();
        System.out.println("Empty : " + z);


        System.out.println("-------------");
        Predicate nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = arg -> arg.length() > 0;
        Predicate<String> nueCheck = nullCheck.and(emptyCheck);
        System.out.println(nueCheck.test("hi"));
        System.out.println(nueCheck.test(""));
        System.out.println("-------------------------");


    }
}
