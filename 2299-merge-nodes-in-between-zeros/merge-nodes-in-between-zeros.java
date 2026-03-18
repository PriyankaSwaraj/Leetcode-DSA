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
     int sum=0;
     ListNode temp=head.next;
     while(temp!=null&&temp.val!=0)
     {
        sum += temp.val;
        temp=temp.next;
     }
     ListNode curr=temp.next;
     temp.val=sum;
     head=temp;
     ListNode prev=temp;
     while(curr!=null&&curr.next!=null)
     {
        int sum2=0;
        ListNode current=curr;
        while(current.val!=0)
        {
            sum2 += current.val;
            current = current.next;
        }
        ListNode tem=new ListNode(sum2);
        prev.next=tem;
        prev =prev.next;
        curr=current.next;
     }
     return temp;  
    }
}