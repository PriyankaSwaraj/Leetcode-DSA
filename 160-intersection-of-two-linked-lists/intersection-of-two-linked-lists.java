/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode temp1=headA;
    ListNode temp2=headB;
    int len1=size(headA);
    int len2=size(headB);
    while(len2>len1)
    {
        temp2 = temp2.next;
        len2--;
    }
    while(len1>len2)
    {
        temp1=temp1.next;
        len1--;
    }
    while(temp1!=temp2)
    {
        temp1=temp1.next;
        temp2=temp2.next;
    }
    return temp1;
    }
    public int size(ListNode head)
    {
        ListNode curr=head;
        int size=0;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        return size;
    }
}