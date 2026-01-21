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
    public boolean isPalindrome(ListNode head) {
     ListNode mid=middle(head);
     ListNode secondhalf=reverse(mid);
     ListNode firsthalf =head;
     while(firsthalf!=mid)
     {
        if(secondhalf.val!=firsthalf.val)
        {
            return false;
        }
        secondhalf=secondhalf.next;
        firsthalf=firsthalf.next;
     }
     return true;
    }
    public ListNode middle(ListNode head)
    {
        int size=0;
        ListNode element=head;
        while(element!=null)
        {
            size++;
            element=element.next;
        }
        size /=2;
        element=head;
        while(size>0)
        {
           size--;
            element=element.next; 
        }
        return element;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)
        {
          return head;
        }
        ListNode previous=null;
        ListNode current=head;
        while(current!=null)
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