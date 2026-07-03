package com.logic.prog;

/* author:  Ankul Deshpande  */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz512 {
    public static void main(String[] args) {

        //Input: n = 3
        //Output: ["1","2","Fizz"]
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number 1 to 5");
        int n = sc.nextInt();
        List<String> answer = fizzBuzz(n);
        System.out.println(answer);

    }

    public static List<String> fizzBuzz(int n) {

        ArrayList answer = new ArrayList();
        //iterate the number
        for (int i = 1; i <= n; i++) {
            //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            }
            //answer[i] == "Fizz" if i is divisible by 3.
            else if (i % 3 == 0) {
                answer.add("Fizz");
            }
            //answer[i] == "Buzz" if i is divisible by 5.
            else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(i);
            }
        }

        return answer;

    }
}
