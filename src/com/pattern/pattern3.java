package com.pattern;

/* Created by Ankul Deshpande on 03-06-2026 18:00 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for process!!");
        int n = sc.nextInt();
        List<List<Integer>> list = pascalTringle(n);
        System.out.println(list);
    }

    private static List<List<Integer>> pascalTringle(int n) {

        ArrayList<List<Integer>> maiList = new ArrayList();
        ArrayList<Integer> currList;
        ArrayList<Integer> preList = null;

        //iterate for each row and column
        //O(n^2)
        for (int row = 0; row < n; row++) {
            //create every time new list
            currList = new ArrayList();
            for (int col = 0; col <= row; col++) {

                if (col == 0 || col == row) {
                    //add the 1 to current list:
                    currList.add(1);

                } else {
                    currList.add(preList.get(col - 1) + preList.get(col));
                }

            }

            //transfer the current list to previous list for next iteration
            preList = currList;
            maiList.add(currList);

        }

        return maiList;

    }
}
