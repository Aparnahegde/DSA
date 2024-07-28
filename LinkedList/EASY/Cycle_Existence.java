/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean middleNode(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;
        while(p2!=null&&p2.next!=null){                      
            p1=p1.next;                                      
            p2=p2.next.next;
        }
      if(p1==p2){
        return true;
      }
        return false;
    }
}
