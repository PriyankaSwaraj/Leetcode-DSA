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
    public int numComponents(ListNode head, int[] nums) {
     if(head==null)
     {
        return 0;
     }
     int count=0;
     ListNode temp=head;
     HashSet<Integer> set=new HashSet<>();
     int n=nums.length;
     for(int num:nums)
     {
        set.add(num);
     }
     while(temp!=null)
     {
        boolean check=false;
        while(temp!=null&&set.contains(temp.val))
        {
            check=true;
            set.remove(temp.val);
            temp=temp.next;
        }
        if(check)
        {
            count++;
        }
        else
        temp=temp.next;
     }
     return count;
    }
}