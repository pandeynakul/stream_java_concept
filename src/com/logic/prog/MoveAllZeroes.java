package com.logic.prog;

/* Created by Ankul Deshpande  */

public class MoveAllZeroes {
    public static void main(String[] args) {

        //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println();
        moveZeroes2PtrsApproach(nums);

    }

    private static void moveZeroes2PtrsApproach(int[] nums) {

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            //swap it if non -zero with zeroes
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }

        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }

    }

    //follow two pointer approach
    public static void moveZeroes(int[] nums) {

        int j = 0;
        //iterate over loop
        for (int i = 0; i < nums.length; i++) {

            //if the required element are not zero
            if (nums[i] != 0) {
                //swap it:
                nums[j++] = nums[i];
            }

        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }

    }
}
