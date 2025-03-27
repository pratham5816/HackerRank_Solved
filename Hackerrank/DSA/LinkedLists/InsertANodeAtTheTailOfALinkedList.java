package DSA.LinkedLists;

public class InsertANodeAtTheTailOfALinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }

    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = newnode;
            return head;
        }
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
        return head;

    }
}
