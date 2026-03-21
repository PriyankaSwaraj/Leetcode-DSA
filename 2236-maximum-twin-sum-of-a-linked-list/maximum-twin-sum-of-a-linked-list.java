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
    public int pairSum(ListNode head) {
    int maxSum=0,n=0;
    for(ListNode temp=head;temp!=null;temp=temp.next)
    {
        n++;
    }
    ListNode temp=head;    
    for(int i=0;i<n/2;i++)
    {
        temp=temp.next;
    }
    ListNode temp2=reverseList(temp);
    temp=head;
    while(temp2!=null)
    {
        maxSum=Math.max(maxSum,temp.val+temp2.val);
        temp=temp.next;
        temp2=temp2.next;
    }
    return maxSum;
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