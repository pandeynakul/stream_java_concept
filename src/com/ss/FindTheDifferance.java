package com.ss;

/* Created by Ankul Deshpande  */

public class FindTheDifferance {

    public static void main(String[] args) {
        //Input: s = "abcd", t = "abcde"
        //Output: "e"
        //Explanation: 'e' is the letter that was added.
        String s = "";
        String t = "y";
        char dValue = findTheDifference(s, t);
        System.out.println(dValue);

    }

    public static char findTheDifference(String s, String t) {


        int total = 0;

        //for t
        for (int i = 0; i < t.length(); i++) {
            total = total + t.charAt(i);
        }
        //for s
        for (int i = 0; i < s.length(); i++) {
            total = total - s.charAt(i);

        }

        return (char) total;
    }
}
