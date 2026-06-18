package com.hm;

/* Created by Ankul Deshpande on 17-06-2026 11:21 */

//from sorted array!
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2,
// with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int rd = removeDuplicates(nums);
        System.out.println(rd);
    }

    //remove duplicates and return count for unique with remaining one
    private static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            //check the next element are same or not
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }
}
