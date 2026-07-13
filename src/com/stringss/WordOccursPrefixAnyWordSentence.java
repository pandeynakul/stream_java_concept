package com.stringss;

/* author :  Ankul Deshpande */

import java.util.OptionalInt;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

//Input: sentence = "i love eating burger", searchWord = "burg"
//Output: 4
public class WordOccursPrefixAnyWordSentence {
    public static void main(String[] args) {
        WordOccursPrefixAnyWordSentence wordOccurs = new WordOccursPrefixAnyWordSentence();
        String sentence = "this problem is an easy problem";
        String searchWord = "pro";
        int wordIndex = wordOccurs.isPrefixOfWord(sentence, searchWord);
        System.out.println(wordIndex);
        int wordIndexJava8 = wordOccurs.isPrefixOfWordJava8(sentence, searchWord);
        System.out.println(wordIndexJava8);
    }


    public int isPrefixOfWord(String sentence, String searchWord) {

        //split into the toString []
        String[] word = sentence.split(" ");
        for (int i = 0; i < sentence.length(); i++) {
            if (word[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

    public int isPrefixOfWordJava8(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        return IntStream.range(0, words.length)
                .boxed()
                .filter(i -> words[i].startsWith(searchWord))
                .findFirst()
                .map(i -> i + 1)
                .orElse(-1);

    }
}
