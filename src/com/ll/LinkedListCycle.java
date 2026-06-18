package com.ll;

/* Created by Ankul Deshpande on 13-06-2026 17:19 */

//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Input: head = [1,2], pos = 0
//Output: true
public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;

        }
    }

    //Time Complexity:
    //𝑂(𝑛)— each node visited at most twice.
    //Space Complexity:
    //𝑂(1)— no extra data structures needed.
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;
        //tortoise
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            //perform the increment
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                //cycle detected
                return true;
            }

        }
        return false;//reached end, no cycle


    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(-4);

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        //create cycle:Make the fourth node’s next pointer point back to the second node.”
        // listNode.next.next.next.next = listNode.next;

        boolean isCycle = linkedListCycle.hasCycle(listNode);

        if (isCycle) {
            System.out.println("cycle detected!");

        } else {
            System.out.println("cycle not detected");
        }


    }
}
