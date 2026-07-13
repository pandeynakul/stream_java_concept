package com.stringss;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseTheSentence {

    public static void main(String[] args) {
        //Input: s = "the sky is blue"
        //Output: "blue is sky the"
        String s = "the sky is blue";
        ReverseTheSentence reverseTheSentence = new ReverseTheSentence();
        String output = reverseTheSentence.reverseWords(s);
        System.out.println(output);
        String outputJava8 = reverseTheSentence.reverseWordsJava8(s);
        System.out.println(outputJava8);
    }


    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();

    }

    //in java 8
    private String reverseWordsJava8(String s) {
        String re =Arrays.stream(s.split(" ")).collect(Collectors.
                collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return String.join(" ", list);
                }));
        return re;
    }
}
