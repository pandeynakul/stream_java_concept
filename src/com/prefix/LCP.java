package com.prefix;

/* Created by Ankul Deshpande  */

//longest common prefix:

import java.util.Arrays;

public class LCP {
    public static void main(String[] args) {
        //Input: strs = ["flower","flow","flight"]
        //Output: "fl"
        String[] strs = {"flow", "flower", "flight"};
        String passTc = longestCommonPrefix(strs);
        System.out.println("LCP : " + passTc);

        String[] strs2 = {"dog", "racecar", "car"};
        // Output: ""
        String fTestCase = longestCommonPrefix(strs2);
        System.out.println("LCP : " + fTestCase);
    }

    public static String longestCommonPrefix(String[] strs) {


        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        //or with the help of forEach you can check element.

        //to append the character
        StringBuilder sb = new StringBuilder();
        //find the first and last
        String word1 = strs[0];
        System.out.println(word1);
        String lastWord = strs[strs.length - 1];
        System.out.println(lastWord);

        //compare the first and last word char it is sorted
        for (int i = 0; i < strs.length; i++) {
            if (word1.charAt(i) != lastWord.charAt(i)) {
                break;
            }
            sb.append(word1.charAt(i));
        }


        return sb.toString();

    }
}
