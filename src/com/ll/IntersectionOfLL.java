package com.ll;

 /* practiced By:  Ankul Deshpande 
    04-07-2026
  */

import java.util.LinkedList;
import java.util.List;

public class IntersectionOfLL {

   static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
            next = null;
        }

    }

    ListNode head;

    //insert nodes in ll
    public void insertTheNodesFromStarts(int value) {
        if (head == null) {
            head = new ListNode(value);
        } else {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
        }

    }

    //display ll
    public void display(ListNode result ) {
        //make head as current:
        ListNode current = result;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode current = headA;
        //multiply with -1
        while (current != null) {
            current.value= current.value * -1;
            current = current.next;
        }
        //intersectVal
        ListNode intersectVal=null;
        current = headB;
        while (current != null) {
            if (current.value < 0) {
                intersectVal = current;
                break;
            }
            current=current.next;
        }

        current = headA;

        while (current != null) {
            current.value= current.value * -1;
            current = current.next;
        }

        return intersectVal;

    }

    public static void main(String[] args) {
        // Create list A: 4 -> 1 -> 8 -> 4 -> 5
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        ListNode intersect = new ListNode(8);
        headA.next.next = intersect;
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);

        // Create list B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect; // <-- share the same node

        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersected at '" + result.value + "'");
        } else {
            System.out.println("No intersection");
        }

        IntersectionOfLL intersectionOfLL=new IntersectionOfLL();
        intersectionOfLL.display(result);

    }
}
