package com.hm;

/* Created by Ankul Deshpande  */

public class ValidAnagram {
    public static void main(String[] args) {
        //Input: s = "anagram", t = "nagaram"
        String s = "rat";
        String t = "car";
        //Output: true

        //Input: s = "rat", t = "car"
        //Output: false
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {

        int arr[] = new int[26];
        //for loop s
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        //for loop t
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }

        //for loop to check count
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=0){
                return false;
            }
        }

        return true;
    }
}
