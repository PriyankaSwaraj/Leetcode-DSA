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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        {
            return head;
        }
    ListNode element=head;
    while(element.next!=null)
    {
        if(element.val==element.next.val)
        {
            element.next=element.next.next;
            continue;
        }
        element=element.next;
    }    
    return head;
    }
}