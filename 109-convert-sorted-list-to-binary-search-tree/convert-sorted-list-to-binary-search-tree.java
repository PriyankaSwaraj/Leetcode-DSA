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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
    ArrayList<Integer> arr=new ArrayList<>();
    while(head!=null)
    {
        arr.add(head.val);
        head=head.next;
    }   
    int n=arr.size();
    return build(arr,0,n-1); 
    }
    public TreeNode build(ArrayList<Integer> arr,int low,int high)
    {
        if(low>high)
        {
            return null;
        }
        int n=(low+high)/2;
        TreeNode root=new TreeNode(arr.get(n));
        root.left=build(arr,low,n-1);
        root.right=build(arr,n+1,high);
        return root;
    }
}