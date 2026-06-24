package com.ss;

/* Created by Ankul Deshpande  */
//Return the number of vowel strings words[i]
// where i belongs to the inclusive range [left, right].
public class CountVowelStrings {

    //Input: words = ["are","amy","u"], left = 0, right = 2
    //Output: 2
    public static void main(String[] args) {
        String[] words = {"hey","aeo","mu","ooo","artro"};
        int left = 1;
        int right = 4;
        int count = vowelStrings(words, left, right);
        System.out.println(count);
    }

    private static int vowelStrings(String[] words, int left, int right) {
        //first and last

        int count = 0;

        for (int i = left; i <= right; i++) {
            String word = words[i];
            char fc = word.charAt(0);
            char lc = word.charAt(word.length() - 1);
            //check first character of string
            if (fc == 'a' || fc == 'e' || fc == 'i' ||
                    fc == 'o' || fc == 'u') {

                //check the last character of string
                if (lc == 'a' || lc == 'e' || lc == 'i' ||
                        lc == 'o' || lc == 'u') {
                    count++;
                }
            }

        }
        return count;
    }
}
//