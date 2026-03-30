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
        if(head==null||head.next==null)
        {
            return head;
        }
    int[] freq=new int[201];
    ListNode temp=head;
    while(temp!=null)
    {
        int num=temp.val;
        if(num<0)
        {
            freq[num*(-1)-1]++;
        }
        else{
            freq[100+num]++;
        }
        temp=temp.next;
    }
    temp=head;
    boolean check=true;
    for(int i=99;i>=0;i--)
    {
        if(freq[i]==1)
        {
            temp.val=(i+1)*(-1);
            temp=temp.next;
            check=false;
        }
    }
    for(int i=100;i<201;i++)
    {
        if(freq[i]==1)
        {
            temp.val=i-100;
            temp=temp.next;
            check=false;
        }
    }
    if(check)
    {
        return null;
    }
    if(temp!=null)
    {
    temp.next=null;
    temp=head;
    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;
    }
    return head;   
    }
}