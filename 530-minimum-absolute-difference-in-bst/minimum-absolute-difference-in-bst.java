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
    public int getMinimumDifference(TreeNode root) {
     ArrayList<Integer> tree = new ArrayList<>();
     inorder(root,tree);
     int min=Integer.MAX_VALUE,n=tree.size();
     for(int i=1;i<n;i++)
     {
        min=Math.min(min,Math.abs(tree.get(i)-tree.get(i-1)));
     }    
     return min;
    }
    public void inorder(TreeNode root,ArrayList<Integer> tree)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,tree);
        tree.add(root.val);
        inorder(root.right,tree);
    }
}