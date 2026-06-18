package com.ll;

/* Created by Ankul Deshpande on 12-06-2026 05:29 */

//linked list in implementation

//Start with an empty list (head = null).
//Insert 10: head → 10 -> null.
//Insert 20: head → 20 -> 10 -> null.
//Insert 30: head → 30 -> 20 -> 10 -> null.
//So each new node becomes the new head, pushing the existing list forward.
public class InsertNodesInLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //head of the list:
    Node head;

    // Insert node at the start
    private void insertAtStart(int i) {
        Node newNode = new Node(i);
        //point the new node to head
        //whatever data into the head --> transfer to -->newNodd.next
        newNode.next = head;
        //update the head to new node
        head = newNode;
       // productNode(head);
    }

    private void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");

    }

    private void productNode(/*Node current*/) {
        Node current = head;
        int product = 1;
        while (current != null) {
            product = product * current.data;
            current = current.next;

        }
        System.out.println("product :  " + product);
    }


    public static void main(String[] args) {
        //insert
        InsertNodesInLL insertNodesInLL = new InsertNodesInLL();
        insertNodesInLL.insertAtStart(10);
        insertNodesInLL.insertAtStart(20);
        insertNodesInLL.insertAtStart(30);
        //imisubcozicare4u
        System.out.println("Linked List after inserting at start:");
        insertNodesInLL.display();
        insertNodesInLL.productNode();

    }


}
