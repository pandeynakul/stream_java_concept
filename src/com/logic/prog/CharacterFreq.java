package com.logic.prog;

/* Created by Ankul Deshpande on 12-05-2026 03:24 */

//it should be fundamental

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CharacterFreq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the statement");
        String line = sc.nextLine();
        characterFreq(line);
        characterFreqJava8(line);

    }


    public static void characterFreq(String line) {

        //pure brute force!
        for (char c = 'a'; c <= 'z'; c++) {
            //for next character count should be zero
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == c) {
                    count++;
                }

            }
            if (count != 0)
                System.out.println(c + " " + count);

        }

    }

    private static void characterFreqJava8(String line) {
        System.out.println("---in java 8----");
        //instream of character::
        //convert to character
        //keep only letter -optional
        Map<Character, Long> collect = line.chars().mapToObj(c -> (char) c).filter(Character::isLetter).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
