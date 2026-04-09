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
    int sum=0;
    public int findTilt(TreeNode root) {
    find(root);
    return sum;
    }  
    public int find(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lf=find(root.left);
        int rf=find(root.right);
        sum += Math.abs(lf-rf);
        return root.val+lf+rf;
    }
}