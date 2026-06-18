package com.logic.prog;

/* Created by Ankul Deshpande on 26-05-2026 14:54 */

import java.util.Scanner;

public class DescendingSelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many element do u want to add in array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element");
            arr[i] = sc.nextInt();
        }
        System.out.println("print the unsorted array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //start the process of selection sort in descending order
        //find the max element and swap
        for (int i = 0; i < n; i++) {
            //assume value get increased and its should  be locked to lH
            int max = arr[i];
            int pos = i;

            for (int j = i; j < n ; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    pos = j;
                }

            }
            //swap it
            int t = arr[i];
            arr[i] = arr[pos];
            arr[pos] = t;

        }
        System.out.println("print the sorted array-descending!");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
