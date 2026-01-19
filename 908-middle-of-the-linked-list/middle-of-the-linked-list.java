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
   if(head.next==null)
   {
    return head;
   }
   ListNode curr=head;
   ListNode after=head.next;
   while(after.next!=null&&after.next.next!=null)
   {
    curr=curr.next;
    after=after.next.next;
   }
   return curr.next;
    }
}