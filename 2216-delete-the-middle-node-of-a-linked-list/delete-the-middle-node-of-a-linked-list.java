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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
        {
            head=null;
            return head;
        }
    ListNode curr= head;
    ListNode ne =head.next;
    while(ne.next!=null&&ne.next.next!=null)
    {
        curr=curr.next;
        ne=ne.next.next;
    }
    curr.next=curr.next.next;
     return head;
    }
}