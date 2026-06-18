package com.ll;

/* Created by Ankul Deshpande on 12-06-2026 04:09 */

public class InsertTheNode {
    public static void main(String[] args) {
        Node startPtr = null;
        Node node = new Node();
        node.data = 23;
        if (startPtr == null) {
            startPtr = node;
        } else {
            node.next = startPtr;
            startPtr = node;
        }

        while (startPtr != null) {
            System.out.println(node.data);
            startPtr = node.next;
        }
        System.out.println("null");

    }
}
