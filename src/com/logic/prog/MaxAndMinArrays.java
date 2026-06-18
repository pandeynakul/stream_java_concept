package com.logic.prog;

/* Created by Ankul Deshpande on 22-05-2026 18:09 */

public class MaxAndMinArrays {

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 67, 8, 54, 45, 9, 1};
        minElement(arr);
        maxElement(arr);
    }

    private static void maxElement(int[] arr) {
        //suppose max=arr[0]
        int max = arr[0];
        int pos = 0;
        //compare the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
                pos=i;
            }
        }
        System.out.println("Maximin Element " + max + " position of Element " + pos);

    }


    //brute force
    private static void minElement(int[] arr) {
        //suppose the first one is the min
        int min = arr[0];
        int pos = 0;
        //compare with other element
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                pos = i;
            }
        }
        System.out.println("Minimum Element " + min + " position of Element " + pos);
    }
}
