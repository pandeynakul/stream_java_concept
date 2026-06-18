package com.logic.prog;

/* Created by Ankul Deshpande on 13-05-2026 03:51 */

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//consecutive duplicate removal
//input : compuutterrrr
//output: computer

public class ConsecutiveDuplicateRemove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String word = sc.nextLine();
        consecutiveRemoval(word);
        consecutiveRemoval1(word);
        consecutiveRemoval8(word);
    }


    private static void consecutiveRemoval1(String word) {

        System.out.println("-with StringBuilder -");
        StringBuilder sb = new StringBuilder();
        char prev = ' ';
        for (int i = 0; i < word.length(); i++) {
            if (prev != word.charAt(i))
                sb.append(word.charAt(i));

            //allocating current character to previous variable
            prev = word.charAt(i);

        }
        System.out.println(sb.toString());
    }

    //O(n^2)
    private static void consecutiveRemoval(String word) {
        //iterate the character form -word
        //brute force

        String current = "";
        char prevchar = ' ';
        for (int i = 0; i < word.length(); i++) {
            if (prevchar != word.charAt(i)) {
                //appending the character to String
                current = current + word.charAt(i);
            }
            //Allocating current character to previous character
            //process is going on still it complete lenght of the string !
            prevchar = word.charAt(i);

        }
        System.out.println(current);

    }

    //O(n)
    private static void consecutiveRemoval8(String word) {
        String result = IntStream.range(0, word.length() - 1).
                filter(i -> i == 0 || word.charAt(i) != word.charAt(i - 1)).
                mapToObj(i -> String.valueOf(word.charAt(i))).collect(Collectors.joining());
        System.out.println("with java eight - " + result);

    }

}
