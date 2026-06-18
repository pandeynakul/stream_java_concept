package com.ll;

/* Created by Ankul Deshpande on 13-06-2026 04:44 */

public class SumOfLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Head of the list
    Node head;

    private void insertNode(int data) {

        Node newNode = new Node(data);
        // point new node to current head
        newNode.next = head;
        // update head to new node
        head = newNode;

    }
    //

    private void displayLl() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

    private void sumOfLL() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum = sum + current.data;
            current = current.next;
        }
        System.out.println("sum : " + sum);

    }

    public static void main(String[] args) {
        //insert node and perform the sum
        //display the node
        //and perform the sum and print
        SumOfLL sumOfLL = new SumOfLL();
        sumOfLL.insertNode(10);
        sumOfLL.insertNode(20);
        sumOfLL.insertNode(30);
        //and then display
        sumOfLL.displayLl();
        //sum inside the node
        sumOfLL.sumOfLL();
    }


}
