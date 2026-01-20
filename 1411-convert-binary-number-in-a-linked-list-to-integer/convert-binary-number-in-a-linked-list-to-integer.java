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
    public int getDecimalValue(ListNode head) {
    int power=-1;
    ListNode element=head;
    while(element!=null)
    {
        power++;
        element=element.next;
    }    
    int num=0;
    ListNode value=head;
    while(value!=null)
    {
        if(value.val==1)
        {
            num += Math.pow(2,power);
        }
        power--;
        value=value.next;
    }
    return num;
    }
}