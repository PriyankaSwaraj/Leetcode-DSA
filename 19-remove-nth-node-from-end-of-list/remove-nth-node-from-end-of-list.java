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
    if(head==null||head.next==null)
    {
        return null;
    }
    ListNode temp=head;
    for(int i=0;i<n;i++)
    {
        if(temp==null)
        {
            return head;
        }
      temp=temp.next;
    }
    if(temp==null)
    {
        return head.next;
    }
    ListNode curr=head;
    while(temp.next!=null)
    {
        curr=curr.next;
        temp=temp.next;
    }
    curr.next=curr.next.next;
     return head;
    }
}