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
    int height=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
       if(root==null)
       return 0; 
      min(root,1);
      return height;   
    }
    public void min(TreeNode root, int level)
    {
        if(root==null)
        return;
        if(root.left==null&&root.right==null)
        height=Math.min(height,level);
        min(root.left,level+1);
        min(root.right,level+1);
    }
}