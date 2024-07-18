https://leetcode.com/problems/middle-of-the-linked-list/


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
    public ListNode middleNode(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;
        while(p2!=null&&p2.next!=null){                      //this ensures that p2 hqve 2 node to traverse otherwise error occur
            p1=p1.next;                                      //when p2 traverse entire LL then p1 traverse half of LL and reach middle of LL
            p2=p2.next.next;
        }
        return p1;
    }
}
