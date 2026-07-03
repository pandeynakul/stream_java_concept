package com.ss;

/* Created by Ankul Deshpande  */
//leetcode 205
//Input: s = "egg", t = "add"
//Output: true
//Explanation:
//The strings s and t can be made identical by:
//Mapping 'e' to 'a'.
//Mapping 'g' to 'd'.

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        //Input:
        String s = "abcd";
        String t = "abab";
        if (isIsomorphic(s, t)) {
            System.out.println("Isomorphic String");
        } else {
            System.out.println("not an isomorphic");

        }

        //Input:
        String s1 = "f11";
        String t1 = "b23";
        if (isIsomorphic1(s1, t1)) {
            System.out.println("Isomorphic String");
        } else {
            System.out.println("not an isomorphic");

        }
    }

    private static boolean isIsomorphic1(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        //put the entries into the map check viceversa
        HashMap<Character, Character> sMap = new HashMap();
        HashMap<Character, Character> tMap = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            //check for smap
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (sMap.containsKey(ss)) {
                if (sMap.get(ss) != tt) {
                    return false;
                }

            } else {
                // extra check: tt must not already be mapped by another char
                if (tMap.containsKey(tt)) return false;
                //not containing  entry put into the map
                sMap.put(ss, tt);
            }
            //check for t map
            if (tMap.containsKey(tt)) {
                if (tMap.get(tt) != ss) {
                    return false;
                }

            } else {
                // extra check: ss must not already be mapped by another char
                if (sMap.containsKey(ss)) return false;
                tMap.put(tt, ss);
            }

        }
        return true;

    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;
        HashMap<Character, Character> hm = new HashMap();
        for (int i = 0; i < s.length(); i++) {


            //find the char
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if ((hm.containsKey(ss) && hm.get(ss) != tt)
                    || (!hm.containsKey(ss) && hm.values().contains(tt))) {
                return false;
            }
            hm.put(ss, tt);

        }

        return true;
    }
}
