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
    public int[] nextLargerNodes(ListNode head) {
    ListNode temp=head;
    ArrayList<Integer> arr=new ArrayList<>();
    while(temp!=null)
    {
        arr.add(temp.val);
        temp=temp.next;
    }    
    Stack<Integer> stack = new Stack<>();
    int n=arr.size();
    int[] nums=new int[n];
    nums[n-1]=0;
    stack.push(arr.get(n-1));
    for(int i=n-2;i>=0;i--)
    {
       
       int num=arr.get(i);
        while(!stack.isEmpty())
        {
            int a=stack.peek();
            if(a>num)
            {
                nums[i]=a;
                stack.push(num);
                break;
            }
            else{
                stack.pop();
            }        
        }
         stack.push(num);
    }
    return nums;
    }
}