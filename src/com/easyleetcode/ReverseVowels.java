package com.easyleetcode;

/* author :  Ankul Deshpande */

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        ReverseVowels reverseVowel = new ReverseVowels();
        String result = reverseVowel.reverseVowels(s);
        System.out.println(result);
    }

    private String reverseVowels(String s) {

        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {

            while (left < right && !isVowel(ch[left])) {
                //increse the left
                left++;
            }
            while (left < right && !isVowel(ch[right])) {
                //decrease the right
                right--;
            }
            //perform the swap
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
