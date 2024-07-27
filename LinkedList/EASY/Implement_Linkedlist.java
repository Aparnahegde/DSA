public class Node{
int value;
  Node next;
  Node(int value){
    this.value=value;
  }
}

public class Linkedlist{
Node head;
  public void add(int data){
Node newNode=new Node(data);
    if(head==null) head=newNode;
    else{
      Node last=head;
      while(last!=null){
        last=last.next;
      }
      last.next=newNode;
    }
  }
}
