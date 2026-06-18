package com.logic.prog;

/* Created by Ankul Deshpande on 28-05-2026 14:08 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element do u want to add in array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element");
            arr[i] = sc.nextInt();
        }
        //Array should be sorted for bS
        System.out.println("print the sorted array!");
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        //ask the user element to be searched
        System.out.println("Enter the element");
        int inputTobeSearched = sc.nextInt();

        // devide the array
        int start = 0;
        int end = arr.length - 1;
        int pos = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == inputTobeSearched) {
                pos = mid;
                break;
            } else if (inputTobeSearched < arr[mid]) {
                //then 20<30//40<30
                end = mid - 1;
            } else {
                start = mid + 1;

            }


        }
        if (pos == -1) {
            System.out.println("Element _ not found!");
        } else {
            System.out.println("Found at " + pos + " " + arr[pos]);
        }


    }
}
