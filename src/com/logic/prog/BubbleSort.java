package com.logic.prog;

/* Created by Ankul Deshpande on 21-05-2026 14:57 */

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        //ask user to input array::
        Scanner sc = new Scanner(System.in);
        System.out.println("How may element do u want to enter??");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //add element to the array!
        System.out.println("Enter the Elements " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //pass it to the method:
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        System.out.println("Entered the Elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("sort the element:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                //compare it and swap it:
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("sorted  Elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
