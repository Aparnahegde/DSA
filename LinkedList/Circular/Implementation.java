public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Points to itself to make the list circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Make the list circular
        }
    }

    // Display the elements of the circular linked list
    public void display() {
        if (head != null) {
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    // Size of the circular linked list
    public int size() {
        if (head == null) return 0;
        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Circular Linked List:");
        list.display();

        System.out.println("Size of the list: " + list.size());
    }
}



