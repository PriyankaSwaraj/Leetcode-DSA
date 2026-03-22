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
    public ListNode removeNodes(ListNode head) {
    Stack<Integer> stack=new Stack<>();
    stack.push(head.val);
    ListNode current=head.next;
    while(current!=null)
    {
        int num=current.val;
        while(!stack.isEmpty())
        {
            if(stack.peek()<num)
            {
                stack.pop();
            }
            else{
                break;
            }
        }
        current=current.next;
        stack.push(num);
    }
    int n=stack.size();
    ArrayList<Integer> nums=new ArrayList<>(stack);
    head.val=nums.get(0);
    ListNode temp=head;
    for(int i=1;i<n;i++)
    {
        temp=temp.next;
        temp.val=nums.get(i);
    }
    if(temp!=null)
    temp.next=null;
    return head;    
    }
}