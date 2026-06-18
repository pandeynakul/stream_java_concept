package com.app.java8;

/* Created by Ankul Deshpande on 15-05-2026 10:58 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public static void main(String[] args) {

        System.out.println("statement should reverse and word also get reverse !");
        String statement = "nothing is impossible";
        String[] srr = statement.split("//s+");
        List rev = Arrays.stream(srr).map(x -> new StringBuilder(x).reverse().toString()).
                collect(Collectors.toList());
        System.out.println(rev);//[elbissopmi si gnihton]
        System.out.println();
        System.out.println("<=======reverse the word but dont reverse the statement ========>");
        String[] sar = statement.split(" ");
        List<String> revS = Arrays.stream(sar).map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(revS);
        revS.forEach((x) -> System.out.print(x + " "));


    }
}
