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
    public ListNode mergeNodes(ListNode head) {
     ListNode curr=head.next;
     ListNode prev=head;
     while(curr!=null&&curr.next!=null)
     {
        int sum2=0;
        ListNode current=curr;
        while(current.val!=0)
        {
            sum2 += current.val;
            current = current.next;
        }
        prev.val=sum2;
        prev =prev.next;
        curr=current.next;
     }
     prev.next=null;
     ListNode num=head;
     while(num.next!=null&&num.next.next!=null)
     {
        num =num.next;
     }
     num.next=null;
     return head;  
    }
}