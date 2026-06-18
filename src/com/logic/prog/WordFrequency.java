package com.logic.prog;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Created by Ankul Deshpande on 11-05-2026 10:51 */


public class WordFrequency {

    public static void main(String[] args) {

        // take the input:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement");
        String line = sc.nextLine();

        withJava8(line);
        //to print the last word! add the space at the end of
        //line or statemnt!
        line = line + " ";
        String w = "";
        //there should be start for first word
        int start = 0;
        //find the word slit by the space
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == ' ') {
                w = line.substring(start, i);
                start = i + 1;
                System.out.println(w + " " + w.length());

            }


        }


    }

    private static void withJava8(String line) {
        System.out.println("-------with  java 8::----------");
        Arrays.stream(line.trim().split("\\s+")).filter(w -> !w.isEmpty()).
                forEach(w -> System.out.println(w + " " + w.length()));
        System.out.println("-------********-----------");

        Map<String, Integer> wordLengths = Arrays.stream(line.trim().split("\\s+"))
                .collect(Collectors.toMap(w -> w, String::length));

        wordLengths.forEach((word, len) -> System.out.println(word + " " + len));

        System.out.println("-------********-//----------");

    }
}
