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
    public void recoverTree(TreeNode root) {
    ArrayList<TreeNode> arr=new ArrayList<>();
    inorder(root,arr);
    TreeNode first=null,second=null;
    int n=arr.size();
    for(int i=0;i<n-1;i++)
    {
        if(arr.get(i).val>arr.get(i+1).val)
        {
            first=arr.get(i);
            break;
        }
    }   
    for(int i=n-1;i>0;i--)
    {
        if(arr.get(i).val<arr.get(i-1).val)
        {
            second=arr.get(i);
            break;
        }
    }
    int data=first.val;
    first.val=second.val;
    second.val=data;
    }
    public void inorder(TreeNode root,ArrayList<TreeNode> arr)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
}