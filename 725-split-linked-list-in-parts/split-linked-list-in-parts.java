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
    public ListNode[] splitListToParts(ListNode head, int k) {

     ListNode[] value=new ListNode[k];
     ListNode temp=head;
     
     int n=0;
     while(temp!=null)
     {
        n++;
        temp=temp.next;
     } 

     temp=head;
     int m=n/k,l=n%k,b=0;
     if(l>0)
     b=1;
     if(k>=n)
     {
       for(int i=0;i<n;i++)
       {
        value[i]=new ListNode(temp.val);
        temp=temp.next;
       }
     }

     else{
        for(int j=0;j<k;j++)
        {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i=0;i<m+b&&temp!=null;i++)
        {
           curr.next=new ListNode(temp.val);
           curr=curr.next;
           temp=temp.next;
        }
        l--;
        if(l<1)
        b=0;
        value[j]=dummy.next;
        }
     }
     
     return value;
    }
}