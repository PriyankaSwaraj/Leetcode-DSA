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
    public ListNode modifiedList(int[] nums, ListNode head) {
    ListNode element=head;
    HashSet<Integer> set =new HashSet<Integer>();
    int n= nums.length;
    for(int i=0;i<n;i++)
    {
        set.add(nums[i]);
    }   
    ListNode val= head;
    while(val.next!=null)
    {
        int k=val.next.val;
        if(set.contains(k))
        {
            val.next=val.next.next;
            continue;
        }
        val=val.next;
    }
    if(set.contains(head.val))
    {
        head=head.next;
    }
    return head;
    }
}