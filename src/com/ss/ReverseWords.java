package com.ss;

/* Created by Ankul Deshpande on 08-06-2026 05:47 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        //Input: s = "the sky is blue"
        //Output: "blue is sky the"
        String s = "the sky is blue";
        String revString = reverseWords(s);
        System.out.println(revString);
        System.out.println("==========");
        String revString2 = reverseWords2(s);
        System.out.println(revString2);

    }


    private static String reverseWords(String s) {

        //remove the spaces
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }

    private static String reverseWords2(String s) {

        String[] arr = s.trim().split("\\s+");
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);

        return String.join(" ", list);
    }
}
