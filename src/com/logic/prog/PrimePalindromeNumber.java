package com.logic.prog;

import java.util.Scanner;

//check required number are palindrome and prime
//for prime and palindrpome
// for prime  devide by 1 and number itself //devide 101
//for palindrome reversering the numbe is also same like 101
//it should be prime and palindrome at the same time!!

public class PrimePalindromeNumber {

    public static void main(String[] args) {
        //ask the  input user
        for (int i = 100; i <= 500; i++) {
            checKprimeAndpalindrome(i);
        }

    }

    public static void checKprimeAndpalindrome(int input) {

        int temp=input;

        if (input <= 1) {
            System.out.println("Not an prime And palindrome ");
        }
        //pass the number to prime
        int primeCheck = isPrime(input);
        if (primeCheck == 2) {
           temp=primeCheck;
        }

        //System.out.println(primeCheck);
        int palindromeCheck = isPalindroome(input);

        if(input==palindromeCheck){
           // System.out.println("palindrome Number :: "+ palindromeCheck);

        }


        if(temp==palindromeCheck){
            System.out.println(temp + " " + palindromeCheck);
        }

    }

    //logic for palindrome!!
    private static int isPalindroome(int input) {
        //reverse number
        int temp = input;
        int rev = 0;
        while (temp != 0) {
            int d = temp % 10;
            //add the reminder
            rev = rev * 10 + d;
            //devide the
            temp = temp / 10;

        }
        return rev;

    }

    //logic for prime
    private static int isPrime(int input) {
        // 0 and 1 are  not prime no need to check here as check already provided over hte calling function
        //base case
       /* if (input >= 1) {
            return -1;
        }*/

        //write an logic for prime !!
        //having only two factor! 1 and that numner
        int countfactor=0;
        for(int  i=1;i<=input;i++){
            if(input%i==0){
                countfactor++;
            }
        }
       return countfactor;

    }
}
