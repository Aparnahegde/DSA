public class Node{
  int data;
  Node next;
  Node prev;
  public Node(int data){
  this .data=data;
    this.next=null;
    this.prev=null;
  }
}

public class LL{
Node head;
  Node tail;
  public void add(int data){
Node newNode=new Node(data);
    if(head==null){
      head=newNode;
      tail=newNode;
    }
    else{
tail.next=newNode;
      newNode.prev=tail;
      tail=newNode;
    }
  }
}
