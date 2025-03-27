package DSA.LinkedLists;

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

public class GetNodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        // Write your code here
        int count = 0;
        SinglyLinkedListNode currrent = llist;
        while (llist.next != null) {
            count++;
            llist = llist.next;
        }

        for (int i = 0; i < count - positionFromTail; i++) {
            currrent = currrent.next;
        }

        return currrent.data;
    }
}
