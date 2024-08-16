static void detectAndRemoveLoop(Node node) {
    Node slow = node, fast = node;
    while (slow != null && fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        // If slow and fast meet at the same point, then a loop is present
        if (slow == fast) {
            removeLoop(slow, node);
            return;
        }
    }
}

// Function to remove the loop
static void removeLoop(Node loop, Node head) {
    Node ptr1 = loop;
    Node ptr2 = loop;

    // Count the number of nodes in the loop
    int k = 1;
    while (ptr1.next != ptr2) {
        ptr1 = ptr1.next;
        k++;
    }

    // Fix one pointer to head
    ptr1 = head;

    // Move the other pointer k nodes after head
    ptr2 = head;
    for (int i = 0; i < k; i++) {
        ptr2 = ptr2.next;
    }

    // Move both pointers at the same pace; they will meet at the start of the loop
    while (ptr2 != ptr1) {
        ptr1 = ptr1.next;
        ptr2 = ptr2.next;
    }

    // Get the last node in the loop
    while (ptr2.next != ptr1) {
        ptr2 = ptr2.next;
    }

    // Set the next of the last node to null to remove the loop
    ptr2.next = null;
}



/*
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 3 (same as earlier node 3, forming a loop)
Step 1: Detect the Loop
Initial state: slow and fast both point to the head (node 1).

Iteration 1:

slow moves to node 2.
fast moves to node 3.
Iteration 2:

slow moves to node 3.
fast moves to node 5.
Iteration 3:

slow moves to node 4.
fast moves to node 3 (because of the loop).
Iteration 4:

slow moves to node 5.
fast moves to node 5.
At this point, slow and fast meet at node 5, indicating that a loop exists in the linked list.

Step 2: Count the Number of Nodes in the Loop
Starting from node 5, move ptr1 around the loop until it meets ptr2 again.
Counting nodes in the loop:
ptr1 moves to node 6 (1st node in the loop).
ptr1 moves to node 3 (2nd node in the loop).
ptr1 moves to node 4 (3rd node in the loop).
ptr1 moves to node 5 (4th node in the loop), meeting ptr2 again.
So, k = 4, indicating there are 4 nodes in the loop.

Step 3: Identify the Start of the Loop
Set ptr1 to the head of the list (node 1).
Set ptr2 k nodes ahead of ptr1.
After moving k=4 nodes ahead: ptr2 is at node 5.
Now move both ptr1 and ptr2 one step at a time until they meet:
Iteration 1: ptr1 moves to node 2, ptr2 moves to node 6.
Iteration 2: ptr1 moves to node 3, ptr2 moves to node 3.
At this point, ptr1 and ptr2 meet at node 3, which is the start of the loop.

Step 4: Remove the Loop
Now, traverse the loop to find the last node in the loop:

Iteration 1: ptr2 moves to node 4.
Iteration 2: ptr2 moves to node 5.
Iteration 3: ptr2 moves to node 6.
Iteration 4: ptr2 moves to node 3 (back to the start of the loop).
The last node in the loop is node 6. To remove the loop, set ptr2.next = null.*/
