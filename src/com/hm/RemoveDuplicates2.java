package com.hm;

/* Created by Ankul Deshpande on 17-06-2026 12:45 */
//Output: 5
public class RemoveDuplicates2 {
    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1,  3, 3, 4};
        //The method doesn’t need to return the modified array itself,
        // because arrays in Java are passed by reference (actually, reference by value).
        //That means changes inside the method affect the original array.
        int rd = removeDuplicates(nums);
        System.out.println(rd);
        System.out.println("Array after removing duplicates:");

        for(int i=0;i<rd;i++){
            System.out.println(nums[i]);
        }
    }

    private static int removeDuplicates(int[] nums) {
        //there is only one element
        if (nums.length == 0) return 0;
        //first element are ways unique as it sorted
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
