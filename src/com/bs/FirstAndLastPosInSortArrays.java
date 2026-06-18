package com.bs;

/* Created by Ankul Deshpande on 07-06-2026 03:41 */

import java.util.Arrays;

//Array is sorted !!
public class FirstAndLastPosInSortArrays {

    public static void main(String[] args) {

        //Input: nums = [5,7,7,8,8,10], target = 8
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;

        //Output: [3,4]
        int[] fl = searchRange(nums, target);
        System.out.println(Arrays.toString(fl));

    }

    public static int[] searchRange(int[] nums, int target) {

        int fb = firstSearchPos(nums, target, true);
        if (fb == -1) return new int[]{-1, -1};
        int lb = firstSearchPos(nums, target, false);
        return new int[]{fb, lb};
    }

    public static int firstSearchPos(int[] nums, int target, boolean b) {

        int bound = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            //find the mid
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                bound = mid;
                if (b) {
                    // keep searching left side
                    right = mid - 1;
                } else {
                    // keep searching right side
                    left = mid + 1;
                }

            } else if (target > nums[mid]) {
                //search right
                left = mid + 1;

            } else {
                //search left
                right = mid - 1;
            }

        }
        return bound;
    }
}
