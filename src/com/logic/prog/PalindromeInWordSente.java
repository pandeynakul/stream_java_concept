package com.logic.prog;

/* Created by Ankul Deshpande on 18-05-2026 12:54 */

import java.util.Scanner;

//madam noon
public class PalindromeInWordSente {

    public static void main(String[] args) {
        askInput();
    }

    private static void askInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the line-");
        String line = sc.nextLine();
        //pass it to the function:
        palindromeWord(line);
    }

    private static void palindromeWord(String line) {
        /*StringBuilder sb=new StringBuilder(line).reverse();
        System.out.println(sb);*/
        char[] charArray = line.toCharArray();
        String s = "";
        for (int c = charArray.length - 1; c >= 0; c--) {
            s = s + charArray[c];
        }
        System.out.printf(s);


    }
}
