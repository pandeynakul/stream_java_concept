package com.hm;

/* Created by Ankul Deshpande  */

import java.util.HashMap;
import java.util.HashSet;

public class ContainDuplicates {
    public static void main(String[] args) {

        //Input: nums = [1,2,3,1]
        int[] nums = {1,2,3,4};
        //Output: true

        //Input: nums = [1,2,3,4]
        //Output: false
        boolean result = containDuplicates(nums);
        System.out.println(result);

    }

    public static boolean containDuplicates(int[] nums) {
        HashSet<Integer> hashSet = new HashSet();

        //iterate the array
        for (int itr : nums) {
            if (hashSet.contains(itr)) {
                return true;
            }
            hashSet.add(itr);
            System.out.println(hashSet);
        }
        return false;
    }

}
