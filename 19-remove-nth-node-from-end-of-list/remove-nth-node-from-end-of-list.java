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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            return null;
        }
     int i=1,size=0;
     ListNode nd=head;
     while(nd!=null)
     {
        nd=nd.next;
        size++;
     }
     int m=size-n;
     if(m==0)
     {
        head=head.next;
        return head;
     }
     ListNode pre=head;
     while(i<m&&pre.next.next!=null)
     {
        pre=pre.next;
        i++;
     }
     pre.next=pre.next.next;
     return head;
    }
}