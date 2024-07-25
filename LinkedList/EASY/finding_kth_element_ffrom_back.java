//require 2 pointer
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    public static ListNode findKthFromEnd(ListNode head, int k) {
        ListNode f = head;
        ListNode s = head;
      for(int i=0;i<k;i++){
        if(f==null){
          return null;
        }
        f=f.next;
      }
    while(f!=null){
      f=f.next;
      s=s.next;
    }
      return s;
    }
}
