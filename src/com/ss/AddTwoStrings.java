package com.ss;

/* Created by Ankul Deshpande on 10-06-2026 08:23 */

public class AddTwoStrings {

    public static void main(String[] args) {
        //Input: num1 = "11", num2 = "123"
        // Output: "134"
        String num1 = "11";
        String num2 = "123";
        String sum = addStrings(num1, num2);
        System.out.println(sum);
    }

    public static String addStrings(String num1, String num2) {

        //digit-1 of num1+digit-1 of num2 + carry=sum
        //char code: 0,1,2.... has asci value 48,49,50....
        //find digit and sum::
        //sum%10=value
        //sum/10 give u carry:
        //51-48=3 give digit 3
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int carry = 0;
        //to append the number :
        StringBuilder sb = new StringBuilder();
        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            //find the n1 and n2:
            int dn1 = (n1 >= 0) ? num1.charAt(n1) - '0' : 0;
            int dn2 = (n2 >= 0) ? num2.charAt(n2) - '0' : 0;

            System.out.println("dn1 : " + dn1 + " dn2 : " + dn2);
            //perform the operation find the sum
            int sum = dn1 + dn2 + carry;
            System.out.println("sum: " + sum);
            //find the number
            carry = sum / 10;
            System.out.println("carry: " + carry);
            System.out.println("sb.append : " + sb.append(sum % 10));
            n1--;
            n2--;//right to left


        }
        return sb.reverse().toString();

    }
}
