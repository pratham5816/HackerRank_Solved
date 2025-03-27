package DSA.LinkedLists;

public class MergeTwoSortedLinkedLists {
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

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode Dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail = Dummy;

        while (head1 != null && head2 != null) {
            if (head1.data >= head2.data) {
                tail.next = head2;
                head2 = head2.next;
            } else {
                tail.next = head1;
                head1 = head1.next;
            }
            tail = tail.next;

        }

        if (head2 == null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return Dummy.next;
    }

}
