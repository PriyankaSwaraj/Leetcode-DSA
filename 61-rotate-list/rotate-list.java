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
    public ListNode rotateRight(ListNode head, int k) {
    int size=0;
    if(head==null||head.next==null||k==0)
    {
        return head;
    }
    ListNode temp=head;
    while(temp!=null)
    {
        temp=temp.next;
        size++;
    }
    int[] arr=new int[size];
    temp=head;
    for(int i=0;i<size;i++)
    {
        arr[i]=temp.val;
        temp=temp.next;
    }
    arr=rotate(arr,k);
    temp=head;
    for(int i=0;i<size;i++)
    {
        temp.val=arr[i];
        temp=temp.next;
    }
    return head;
    }
    public int[] rotate(int[] nums, int k) {
     int n=nums.length;
     k=k%n;
     int[] arr = new int[k];
     for(int i=n-k,j=0;i<n;i++,j++)
     {
        arr[j]=nums[i];
     }
     for(int i=n-1;i>=k;i--)
     {
        nums[i]=nums[i-k];
     }
     for(int i=0;i<k;i++)
     {
        nums[i]=arr[i];
     }
    return nums;
    }
}