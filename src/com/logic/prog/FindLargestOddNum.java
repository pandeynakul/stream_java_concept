package com.logic.prog;

/* author :  Ankul Deshpande */

public class FindLargestOddNum {
    public static void main(String[] args) {
        FindLargestOddNum findLargestOddNum = new FindLargestOddNum();
        String num = "4276";
        String Output = findLargestOddNum.largestOddNumber(num);
        System.out.println(Output);

    }

    //use of the substring:
    private String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
