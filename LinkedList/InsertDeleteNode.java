

public class Linked {
    Node head;
    Node tail;
    class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
    }
    }

    //ADD first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //ADD Last
    public void addLast(String data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curNode=head;
        while (curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }

//Printing
public void Printlist() {
        if(head==null){
            System.out.println("Empty list");
            return;
        }
    Node curNode = head;
    while (curNode != null) {
        System.out.print(curNode.data+"-->");
        curNode = curNode.next;
    }
    System.out.println("NULL");
}

//delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        head=head.next;
    }
//delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }


    public static void main(String[] args) {
        Linked list=new Linked();
        list.addFirst("a");
        list.addFirst("is");
        list.Printlist();
        list.addLast("List");
        list.Printlist();
        list.addFirst("this");
        list.Printlist();
        list.deleteLast();
        list.Printlist();

    }
}
