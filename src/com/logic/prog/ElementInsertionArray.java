package com.logic.prog;

/* Created by Ankul Deshpande on 28-05-2026 16:53 */

import java.util.Scanner;

public class ElementInsertionArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element do u want to add in array");
        int n = sc.nextInt();
        //allocate the size is more
        int[] arr = new int[n + 10];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.println("pos : " + i + " value : " + arr[i]);
        }

        insertElement(n, arr);
        deleteElement(n, arr);

    }

    //override the variable

    private static void deleteElement(int n, int[] arr) {
        Scanner sc = new Scanner(System.in);
        //insert the element in between the array!
        System.out.println("Enter the value element ");
        int element = sc.nextInt();
        System.out.println("Enter the position for element");
        int pos = sc.nextInt();
    }

    private static void insertElement(int n, int[] arr) {
        Scanner sc = new Scanner(System.in);
        //insert the element in between the array!
        System.out.println("Enter the value element ");
        int element = sc.nextInt();
        System.out.println("Enter the position for element");
        int pos = sc.nextInt();
        for (int i = n; i > pos; i--) {
            //swift element to right
            System.out.println(i + " " + arr[i] + " " + arr[i - 1]);
            arr[i] = arr[i - 1];
            //whatever value at arr[3] should shift to the arr[4]
            //arr[4]=arr[3]
        }
        arr[pos] = element;
        ++n;
        for (int i = 0; i < n; i++) {
            System.out.println("pos : " + i + " value : " + arr[i]);
        }
    }
}
