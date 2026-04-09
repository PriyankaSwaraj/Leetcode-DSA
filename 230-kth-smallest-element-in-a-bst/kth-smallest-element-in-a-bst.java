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
    public int kthSmallest(TreeNode root, int k) {
    kElement(root,k);
    return val;
    }
    int val=0,j=0;
    public void kElement(TreeNode root,int k)
    {
        if(root==null)
        {
            return;
        }
        kElement(root.left,k);
        j++;
        if(j==k)
        {
            val=root.val;
        }
        kElement(root.right,k);
    }
}