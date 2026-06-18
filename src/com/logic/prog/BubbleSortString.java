package com.logic.prog;

/* Created by Ankul Deshpande on 21-05-2026 15:52 */

import java.util.Scanner;

public class BubbleSortString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many string do u want to Insert : ");
        int n = sc.nextInt();
        //always add sc.nextLine() after nextInt() (or any non-line-based input) if you plan to read full lines afterward.
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter the " + n + " words");
        //enter the string at arr allocation:
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        bubbleSortString(arr);

    }

    private static void bubbleSortString(String[] arr) {
        //iterate the array
        System.out.println("Entered wors in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //sort it according to their length
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        //iterate the array
        System.out.println();
        System.out.println("sorted- words- array: Alphabetically");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
