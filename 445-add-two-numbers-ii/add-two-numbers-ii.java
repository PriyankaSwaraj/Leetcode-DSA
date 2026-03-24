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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head1=reverse(l1),head2=reverse(l2);
    ListNode dummy=new ListNode(0);
    ListNode current=dummy;
    int carry=0;
    while(head1!=null||head2!=null||carry!=0)
    {
        int sum=carry;
        if(head1!=null)
        {
            sum += head1.val;
            head1=head1.next;
        }
        if(head2!=null)
        {
            sum += head2.val;
            head2=head2.next;
        }
        current.next=new ListNode(sum%10);
        current=current.next;
        carry=sum/10;
    }
    return reverse(dummy.next);
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
       head.next=null; 
    return prev;
    }
}