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
    public ListNode swapNodes(ListNode head, int k) {
    if(head==null||head.next==null)
    {
        return head;
    }
     ListNode temp=head;
     int size=0;
     while(temp!=null)
     {
        size++;
        temp=temp.next;
     }   
     ListNode curr=head;
     int m=size-k;
     for(int i=0;i<m;i++)
     {
        curr=curr.next;
     }
     ListNode prev=head;
     for(int i=0;i<k-1;i++)
     {
        prev=prev.next;
     }
     int value=prev.val;
     prev.val=curr.val;
     curr.val=value;
     return head;
    }
}