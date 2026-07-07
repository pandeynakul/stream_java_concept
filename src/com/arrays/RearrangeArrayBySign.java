package com.arrays;

/* author :  Ankul Deshpande */

import java.util.Arrays;

//Input: nums = [3,1,-2,-5,2,-4]
//Output: [3,-2,1,-5,2,-4]
public class RearrangeArrayBySign {

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] ans = rearrangeArray(nums);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] rearrangeArray(int[] nums) {


        int[] ans = new int[nums.length];
        //declare the posIndex and negIndex;
        //save the positive from  this index and increased by +2:
        int posIndex = 0;
        //save the -ve o this index
        int negIndex = 1;
        for (int i = 0; i < nums.length; i++) {

            //increased by 2 and save into the 0 if +ve
            if (nums[i] > 0) {
                //value is +ve
                ans[posIndex] = nums[i];
                posIndex = posIndex + 2;

            } else {
                ans[negIndex] = nums[i];
                negIndex = negIndex + 2;
            }


        }
        return ans;
    }
}
