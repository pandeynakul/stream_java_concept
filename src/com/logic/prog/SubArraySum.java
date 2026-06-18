package com.logic.prog;

/* Created by Ankul Deshpande on 13-05-2026 05:52 */
//find the subArray that sums up to k
//input: 1 2 3
//k=3
//logic 1 2 output 3
//basically checking the array concept
//continuous subarray

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {

        //define the single array
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elemnet Do you want to enter!");
        int input = sc.nextInt();
        arr = new int[input];
        for (int i = 0; i < input; i++) {
            System.out.println("enter the element!");
            arr[i] = sc.nextInt();
        }
        System.out.printf("Enter the sum which is to be calculated (k) : ");
        int k = sc.nextInt();
        //iterate the array!
       /* for(int x: arr){
            System.out.println(x);
        }*/
        //pass the array to method for operation subArray
        subArraySum(arr, k);
    }

    //how many subset try to print the subset also
    private static void subArraySum(int[] arr, int k) {
        //find the subArray that sums up to k
        //brute force
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            // you need make the sum=0 after 2 loop get excuted  for next number
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    result++;
                    System.out.print("Subarray " + result + ": [");
                    for (int r = i; r <= j; r++) {

                        System.out.print(arr[r] + " ");
                    }
                    System.out.println("]");
                }
            }
        }
        //total subarray
        System.out.println("Total subarrays with sum " + k + "=" + result);

    }
}
