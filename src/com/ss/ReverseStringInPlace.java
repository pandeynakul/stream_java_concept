package com.ss;

/* Created by Ankul Deshpande on 08-06-2026 13:30 */

//For this problem, you need to reverse the array of characters
// in-place with O(1) extra memory.
// That means you can’t use extra data structures like another array
// or StringBuilder — just swap characters directly.
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        String[] s = new String[]{"h", "e", "l", "l", "o"};
        char[] chars = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            //
            chars[i] = s[i].charAt(0);

        }
        //pass it dont pass the null
        reverseString(chars);
        System.out.println("--------------");
        String input = "radhe";
        reverseString2(input);

    }

    //reverse with function:    
    private static void reverseString2(String input) {
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);
    }


    private static void reverseString(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;

        }
        System.out.println(new String(chars));


    }
}
