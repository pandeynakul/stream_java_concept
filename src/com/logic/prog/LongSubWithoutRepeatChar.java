package com.logic.prog;

/* Created by Ankul Deshpande on 31-05-2026 15:01 */

/*Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc",
with the length of 3. Note that "bca" and "cab" are also correct answers.*/
//medium
//sliding window:

import java.util.HashSet;

public class LongSubWithoutRepeatChar {
    public static void main(String[] args) {
        //startIdx+maxLength
        longestSubstring("bbbbb");
    }

    private static void longestSubstring(String value) {

        HashSet set = new HashSet();
        int left = 0;
        int maxLength = 0;
        int start = 0;

        for (int right = 0; right < value.length(); right++) {
            //following basically print an index and charAt(right)
            //System.out.println(right - left + 1 + " : " + value.charAt(right));
            while (set.contains(value.charAt(right))) {
                //remove it
                set.remove(value.charAt(left));
                left++;
                //as the left increased the start will change.
            }
            //if not add it
            set.add(value.charAt(right));
            //
            if (right - left + 1 > maxLength) {
                //reset the start to left
                maxLength = right - left + 1;
                start = left;

            }
            String maxSub = value.substring(start, start + maxLength);
            System.out.println(maxSub + " " + maxSub.length());

        }

    }
}
