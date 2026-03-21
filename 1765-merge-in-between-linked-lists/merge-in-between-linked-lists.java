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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    ListNode temp1=list1;
    for(int i=0;i<a-1;i++)
    {
        temp1=temp1.next;
    }
    ListNode temp2=temp1;
    for(int i=a;i<b+2;i++)
    {
      temp2=temp2.next;
    }    
    ListNode head1=list2;
    while(head1!=null)
    {
      temp1.next=head1;
      temp1=temp1.next;
      head1=head1.next;
    }
    temp1.next=temp2;
    return list1;
    }
}