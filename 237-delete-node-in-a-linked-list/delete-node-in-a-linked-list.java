/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
     ListNode temp=node;
     ListNode temp2=node.next;
     while(temp.next.next!=null)
     {
        temp.val=temp.next.val;
        temp=temp.next;
        temp2=temp2.next;
     }
     temp.val=temp2.val;
     temp.next=null;
    }
}