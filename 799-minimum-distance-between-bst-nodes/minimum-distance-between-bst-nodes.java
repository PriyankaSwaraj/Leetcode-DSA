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
    public int minDiffInBST(TreeNode root) {
     ArrayList<Integer> tree=new ArrayList<>();
     inorder(root,tree);
     Collections.sort(tree);
     int min=Integer.MAX_VALUE;
     int n=tree.size();
     for(int i=1;i<n;i++)
     {
        min=Math.min(min,tree.get(i)-tree.get(i-1));
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