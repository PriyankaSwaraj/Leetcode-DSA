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
    public int sumNumbers(TreeNode root) {
        StringBuilder sb=new StringBuilder();
    return sum(root, sb);
    }
    int count=0;
    public int sum(TreeNode root,StringBuilder s)
    {
        if(root==null)
        {
            return 0;
        }
        s.append(root.val);
        if(root.left==null&&root.right==null)
        {
            count += Integer.parseInt(s.toString());
        }
        else{
        sum(root.left,s);
        sum(root.right,s);
        }
        s.deleteCharAt(s.length()-1);
        return count;
    }
}