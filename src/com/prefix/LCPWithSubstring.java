package com.prefix;

/* Created by Ankul Deshpande  */

import java.util.Arrays;

public class LCPWithSubstring {

    public static void main(String[] args) {
        //Input: strs = ["flower","flow","flight"]
        //Output: "fl"
        String[] strs = {"flow", "flower", "flight"};
        String passTc = longestCommonPrefix1(strs);
        System.out.println("LCP : " + passTc);

        String[] strs2 = {"dog", "racecar", "car"};
        // Output: ""
        String fTestCase = longestCommonPrefix1(strs2);
        System.out.println("LCP : " + fTestCase);
    }

    private static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);

        String fw = strs[0];
        String lw = strs[strs.length - 1];
        int index = 0;
        while (fw.length() > index && lw.length() > 0) {
            //perform the operation
            if (fw.charAt(index) == lw.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        //termary:

        return index == 0 ? "" : fw.substring(0, index);
    }
}
