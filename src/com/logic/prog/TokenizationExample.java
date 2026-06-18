package com.logic.prog;

/* Created by Ankul Deshpande on 08-05-2026 14:20 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TokenizationExample {

    public static void main(String[] args) throws IOException {

        //take the input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a statement: ");
        String line = br.readLine();

        //last element must contain the ! or . or ? then its valid statement
        int length = line.length();
        System.out.println("===============");
        System.out.println(length - 1);
        System.out.println(line.charAt(length - 1));
        if (line.charAt(length - 1) == '!' || line.charAt(length - 1) == '?' || line.charAt(length - 1) == '.') {
            //taken input:
            System.out.println("its an valid statement start the operation!");
            System.out.println();
            System.out.println("Enter the word to be deleted");
            String word = br.readLine();
            System.out.println();
            System.out.println("Enter the position of word to be deleted");
            int pos = br.read();
            System.out.println();

            //perform the operation

            StringTokenizer st = new StringTokenizer(line);
            System.out.println("Total number of token " + st.countTokens());
            int totalCount = st.countTokens();

            //delete the word and rearrange the statement
            String joined="";
            for (int i = 1; i <= totalCount; i++) {

                String t = st.nextToken();
                if(i==pos && word.equals(t)){
                    System.out.println(i+" "+t);
                }
                else{
                  joined=joined+t+" ";
                }

            }
            System.out.println(joined);




        } else {
            System.out.println("its an invalid statement Please enter the correct statement!");
        }


        //remove the position

    }
}
