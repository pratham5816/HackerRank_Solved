package DSA.LinkedLists;

import java.util.ArrayList;
import java.util.List;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

public class PrintInReverse {
    public static void reversePrint(SinglyLinkedListNode llist) {
        // Write your code here
        List<Integer> x = new ArrayList<>();

        while (llist != null) {
            x.add(llist.data);
            llist = llist.next;
        }
        List<Integer> reversedList = new ArrayList<>();
        for (int i = x.size() - 1; i >= 0; i--) {
            reversedList.add(x.get(i));
        }

        for (int s = 0; s < reversedList.size(); s++) {
            System.out.println(reversedList.get(s));
        }

    }
}
