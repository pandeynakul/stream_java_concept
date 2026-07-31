package com.fundamenatals;

/* author :  Ankul Deshpande */

//The indexOf() method in Java is used to


public class IndexOfEx {
    public static void main(String[] args) {
        String str = "Hello World";
        // find the position (index) of a character or substring inside a string.
        System.out.println(str.indexOf("World"));
        //If the character/substring is found → returns the index (0-based).
        System.out.println(str.indexOf('d'));
        //If not found → returns -1.
        System.out.println(str.indexOf('z'));

        char ch = 'e';
        System.out.println("aeiouAEIOU".indexOf(ch) == 1);
        System.out.println("aeiouAEIOU".indexOf(ch) != -1);
        System.out.println("=============================//");
        char ch1 = 'z';
        System.out.println("aeiouAEIOU".indexOf(ch1));
        System.out.println("aeiouAEIOU".indexOf(ch1) != -1);
    }
}
