package com.logic.prog;

/* Created by Ankul Deshpande on 25-05-2026 11:49 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonWordFounder {

    public static void main(String[] args) {
        String s1 = "ankul Deshpande";
        String s2 = "ankul";

        //split the string into the word
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        //store the word of first string into the set for Quick look up!

        Set<String> set = new HashSet<>();
        //iterate add into the set
        for (String addWord : words1) {
            set.add(addWord);
        }
        //order is not defined!
        System.out.println(set);
        //find the common word
        HashSet set2 = new HashSet();
        for (String addWord2 : words2) {
            if (set.contains(addWord2)) {
                System.out.println(addWord2);
            }
        }


    }
}
