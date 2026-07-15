package com.floyd;

/* author :  Ankul Deshpande */

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(19));
        System.out.println("----");
        System.out.println(hn.isHappy(2));
    }

    public boolean isHappy(int n) {
        //to detect the cycle use floyd here
        //with fast and slow ptr
        HashSet seen = new HashSet();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            //update n with the new value
            n = squareOfDigit(n);

        }
        //if n=1 then it will return true otherwise it will return  the false:
        return n == 1;
    }

    public int squareOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }
        System.out.println(sum);
        return sum;
    }
}
