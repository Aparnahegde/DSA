class DoublyListNode {
    int val;
    DoublyListNode next;
    DoublyListNode prev;

    DoublyListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList {
    DoublyListNode head;

    // Insert a node at the beginning of the list
    public void insertAtBeginning(int val) {
        DoublyListNode newNode = new DoublyListNode(val);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert a node at the end of the list
    public void insertAtEnd(int val) {
        DoublyListNode newNode = new DoublyListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    // Insert a node after a given node
    public void insertAfter(DoublyListNode prevNode, int val) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null.");
            return;
        }
        DoublyListNode newNode = new DoublyListNode(val);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    // Print the list from the beginning
    public void printList() {
        DoublyListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

