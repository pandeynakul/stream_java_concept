package com.logic.prog;

/* Created by Ankul Deshpande on 22-05-2026 18:30 */

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How may element do u want to add??");
        int n = sc.nextInt();
        System.out.println("enter the" + n + "for array!");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " element");
            arr[i] = sc.nextInt();
        }
        System.out.println("unsorted Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //start the selection sort:
        for (int i = 0; i < arr.length; i++) {
            //find the minimum and compare
            //let us assume first one is min and compare and swap:
            //suppose
            int min = arr[i];
            int pos = i;
            for (int j = i; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    //swap it
                    pos = j;

                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;


        }
        System.out.println("sorted Array :Ascending order");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
