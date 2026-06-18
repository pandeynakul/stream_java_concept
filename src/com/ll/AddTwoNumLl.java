package com.ll;

/* Created by Ankul Deshpande on 13-06-2026 05:58 */

public class AddTwoNumLl {

    static class ListNode {

        ListNode next;
        int val;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        //define the third list to add the result
        ListNode head = new ListNode(0);
        //referencing  to an same list
        ListNode current = head;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                //perform the l1 operation
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                //perform the l2 operation of adding
                sum = sum + l2.val;
                l2 = l2.next;
            }
            //collect the carry
            carry = sum / 10;
            //collect the single digit or number
            current.next = new ListNode(sum % 10);
            current = current.next;


        }

        return head.next;//skip  head
    }

    private void displayResult(ListNode result) {
        ListNode current = result;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Example 1: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumLl addTwoNumLl = new AddTwoNumLl();
        ListNode result = addTwoNumLl.addTwoNumbers(l1, l2);
        System.out.println(result);

        addTwoNumLl.displayResult(result);
    }


}
