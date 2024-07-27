public class Node{
int value;
  Node next;
  Node(int value){
    this.value=value;
  }
}
public class LL{
  Node head;
public void insertStart(int data){
  Node newNode =new Node(data);
  newNode.next=head;
  head=newNode;
}

  public void insertEnd(int data){
    Node curr=head;
    Node newNode =new Node(data);
    if(head==null){
      return newNode;
    }
    else{
    while(curr.next!=null){
    curr=curr.next;
    }
    curr.next=newNode;
    }
     newNode.next=null;
  }
  
}

