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
     int size=1;
     ListNode nd=head;
     while(nd.next!=null)
     {
        size++;
        nd=nd.next;
     }   
     int n=(size/2);
     ListNode curr=head;
     int i=1;
     while(i<n)
     {
        curr=curr.next;
        i++;
     }
     curr.next=curr.next.next;
     return head;
    }
}