package com.ts;

/* Created by Ankul Deshpande on 16-06-2026 10:18 */

import java.util.Arrays;

public class TwoSumll {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        //Output: [1,2]
        int[] arr = twoSum(numbers, target);
        System.out.println(Arrays.toString(arr));
        //Input: numbers = [2,3,4], target = 6
        //Output: [1,3]
        int[] numbers1 = {2, 3, 4};
        int target2 = 8;
        int[] arr2 = twoSum(numbers1, target2);
        System.out.println(Arrays.toString(arr2));

        //Input: numbers = [-1,0], target = -1
        //Output: [1,2]
        int[] numbers2 = {-1, 0};
        int target3 = -1;
        int[] arr3 = twoSum(numbers2, target3);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            if (numbers[left] + numbers[right] > target) {
                right--;

            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                //return the array
                return new int[]{left + 1, right + 1};

            }

        }

        return new int[]{};
    }
}
