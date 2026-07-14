package com.fundamenatals;

/* author :  Ankul Deshpande */

public class PrintAlphabet {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }
        System.out.println();
        PrintAlphabet printAlphabet = new PrintAlphabet();
        printAlphabet.PrintAlphabetArray();
    }

    private void PrintAlphabetArray() {
        char[] arr = new char[26];
        //fill the array:
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('a' + i);

        }
        //print  all character:
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
