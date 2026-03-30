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
    public ListNode partition(ListNode head, int x) {
    int size=0;
    ListNode temp=head;
    while(temp!=null)
    {
        size++;
        temp=temp.next;
    }  
      
    int[] arr=new int[size];
    temp=head;

    for(int i=0;i<size;i++)
    {
        arr[i]=temp.val;
        temp=temp.next;
    }
    arr=parity(arr,x);
    temp=head;

    for(int i=0;i<size;i++)
    {
       temp.val=arr[i];
       temp=temp.next;
    }
    return head;
    }
    public int[] parity(int[] arr,int p)
    {
        int k=0,n=arr.length,l=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<p)
            {
                arr[k]=arr[i];
                k++;
            }
            else{
                nums[l]=arr[i];
                l++;
            }
        }
        for(int i=0;i<l;i++)
        {
           arr[i+k]=nums[i];
        }
        return arr;
    }
}