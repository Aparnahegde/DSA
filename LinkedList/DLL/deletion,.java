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

    // Delete a node from the list
    public void deleteNode(DoublyListNode node) {
        if (head == null || node == null) {
            return;
        }

        // If the node to be deleted is the head node
        if (head == node) {
            head = node.next;
        }

        // Change next only if node to be deleted is NOT the last node
        if (node.next != null) {
            node.next.prev = node.prev;
        }

        // Change prev only if node to be deleted is NOT the first node
        if (node.prev != null) {
            node.prev.next = node.next;
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
