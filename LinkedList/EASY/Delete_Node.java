class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Del {
    public ListNode deleteLast(ListNode head) {
        if (head == null) {
            return null;  // List is empty
        }

        if (head.next == null) {
            return null;  // List has only one node
        }

        ListNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;  // Delete the last node
        return head;
    }

    public ListNode deleteFirst(ListNode head) {
        if (head == null) {
            return null;  // List is empty
        }
        return head.next;  // Update head to the next node
    }
}
