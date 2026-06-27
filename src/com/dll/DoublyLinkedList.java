package com.dll;

/* Created by Ankul Deshpande  */

class DLL {
    int val;
    DLL prev;
    DLL next;

    DLL(int val) {
        this.val = val;
        prev = null;
        next = null;
    }

}

public class DoublyLinkedList {

    private DLL head;
    private DLL tail;

    //for EmptyList
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {

        //create the nodes
        DLL n1 = new DLL(1);
        DLL n2 = new DLL(2);
        DLL n3 = new DLL(3);
        DLL n4 = new DLL(4);
        DLL n5 = new DLL(5);

        // pointing to the next node:
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        //pointing to the previous node
        n2.prev = n1;
        n3.prev = n2;
        n4.prev = n3;
        n5.prev = n4;

        //head and tail
        DLL head = n1;
        DLL tail = n5;

        //print the dl
        printFwDll(head);
        System.out.println();
        //print reverse dll
        printReverseDLL(tail);

    }

    //with next
    private static void printFwDll(DLL head) {
        DLL current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.print("null");
    }

    //with prev
    private static void printReverseDLL(DLL tail) {
        DLL current = tail;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.prev;
        }
        System.out.print("null");
    }
}
