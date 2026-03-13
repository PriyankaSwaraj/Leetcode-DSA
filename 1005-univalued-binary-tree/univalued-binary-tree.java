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
    HashSet<Integer> set=new HashSet<>();
    public boolean isUnivalTree(TreeNode root) {
     if(root==null)
     {
        return false;
     }
     isUnivalTree(root.left);
     isUnivalTree(root.right);
     set.add(root.val);
     return set.size()==1;
    }
}