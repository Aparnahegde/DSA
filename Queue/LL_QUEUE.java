package Q_LL;
public class Oueue_LL {
    public static void main(String[] args) {
        QQ q=new QQ();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
    }
}
class QQ{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node f = null;
    Node r = null;
    public void enqueue(int data) {//O(1)
        Node newNode = new Node(data);
        if (f == null) {
            f = newNode;
            r = newNode;
        } else {
            r.next = newNode;
            r = newNode;
        }
    }
    public void dequeue() {//O(1)
        if (f == null) {
            System.out.println("underflow");
        } else {
            f = f.next;
        }
    }
public void display(){//O(n)
        Node current=f;
        while(current!=null){
            System.out.print(" "+current.data);
            current=current.next;
        }
    System.out.println();
}
}

