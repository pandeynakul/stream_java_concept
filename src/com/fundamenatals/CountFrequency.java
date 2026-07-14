package com.fundamenatals;

/* author :  Ankul Deshpande */
//FirstUniqueCharacter with array
public class CountFrequency {

    public static void main(String[] args) {

        String s1 = "lleetccoodde";
        int[] freq = new int[26];
        //count the freq of character
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        //find the first character freq==1
        for (int i = 0; i < s1.length(); i++) {
            if (freq[s1.charAt(i) - 'a'] == 1) {
                System.out.println(s1.charAt(i));
                break;
            }
        }

    }
}