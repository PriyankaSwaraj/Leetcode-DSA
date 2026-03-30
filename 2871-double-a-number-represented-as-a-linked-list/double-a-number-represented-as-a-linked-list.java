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
    public ListNode doubleIt(ListNode head) {
    head=reverseList(head);
    ListNode temp=head;
    int carry=0;
    while(temp.next!=null)
    {
        int num=(2*temp.val)+carry;
        temp.val=num%10;
        carry=num/10;
        temp=temp.next;
    }
    int num=(2*temp.val)+carry;
    temp.val=num%10;
    carry=num/10;    
    if(carry!=0)
    {
        temp.next=new ListNode(carry);
    }
    return reverseList(head);
    }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
    ListNode previous=head;
    ListNode current =head.next;
    while(current!= null)
    {
        ListNode next=current.next;
        current.next=previous;
        previous=current;
        current=next;
    } 
    head.next=null;
    return previous;
    }
}