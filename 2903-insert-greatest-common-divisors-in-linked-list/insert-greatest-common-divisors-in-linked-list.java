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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
    if(head.next==null)
    {
        return head;
    }  
    ListNode temp=head;
    while(temp!=null&&temp.next!=null)
    {
        int num1=temp.val,num2=temp.next.val;
        ListNode nex=temp.next;
        ListNode curr=new ListNode(gcd(num1,num2));
        temp.next=curr;
        curr.next=nex;
        temp=nex;
    }
    return head;  
    }
   public int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}