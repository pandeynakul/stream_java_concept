package com.logic.prog;

/* author:  Ankul Deshpande  */

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean passCase = wordPattern(pattern, s);
        System.out.println(passCase);

        String pattern1 = "abba";
        String s1 = "dog cat cat fish";
        boolean failedCase = wordPattern(pattern1, s1);
        System.out.println(failedCase);
    }

    public static boolean wordPattern(String pattern, String s) {

        //declare the hashMap for mapping
        HashMap<Character, String> hm = new HashMap<>();
        //Split the pattern
        String[] arr = s.split(" ");
        //base case
        if (arr.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            char p = pattern.charAt(i);
            String word = arr[i];

            if ((hm.containsKey(p) && !hm.get(p).equals(word) ) ||
                    (!hm.containsKey(p) && hm.values().contains(word))) {
                return false;
            }
            hm.put(p, word);
            System.out.println(hm);

        }
        return true;
    }
}
