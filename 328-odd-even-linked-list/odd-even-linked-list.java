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
    public ListNode oddEvenList(ListNode head) {
     if(head==null||head.next==null||head.next.next==null)
     {
        return head;
     }   
     ListNode evenEnd=head.next,evenStart=head.next,oddStart=head,oddEnd=head;
     ListNode currNode=head.next.next;
     ListNode temp=currNode.next;
     while(currNode!=null&&currNode.next!=null&&temp!=null&&temp.next!=null)
     {
       oddEnd.next=currNode;
       oddEnd=oddEnd.next;
       currNode=currNode.next.next;
       evenEnd.next=temp;
       evenEnd=evenEnd.next;
       temp=temp.next.next;
     }
     if(currNode!=null)
     {
        oddEnd.next=currNode;
        oddEnd=oddEnd.next;
     }
     oddEnd.next=evenStart;
     if(temp!=null)
     {
        evenEnd.next=temp;
        evenEnd=evenEnd.next;
     }
     evenEnd.next=null;
     return head;
    }
}