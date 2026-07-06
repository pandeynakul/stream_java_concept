package com.ll;

/* practiced By:  Ankul Deshpande */


import java.util.Scanner;


class Node1 {
    int value;
    Node1 next;

    public Node1(int value) {
        this.value = value;
    }
}

class LL {

    Node1 head;

    public int findIndexOfGivenValue(Node1 head ,Node1 headValue) {
        int i = 0;
        Node1 current = head;
        while (current != null) {
            if (current == headValue) {
              return i;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    public void display(Node1 head) {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;

        }
    }

}

public class FindIndexOfGivenValue {

    public static void main(String[] args) {
        LL ll = new LL();
        //insert the nodes
        Node1 head = new Node1(12);
        head.next = new Node1(14);
        head.next.next = new Node1(16);
        head.next.next.next = new Node1(18);
        head.next.next.next.next = new Node1(19);

        ll.display(head);
        int index = ll.findIndexOfGivenValue(head,head.next.next);
        System.out.println();
        System.out.println(head.next.next.value + " : " + index);

    }


}
