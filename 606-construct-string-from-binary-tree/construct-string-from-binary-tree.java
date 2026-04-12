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
    public String tree2str(TreeNode root) {
        StringBuilder sb=new StringBuilder();
    return tree(root,sb).toString();    
    }
    public StringBuilder tree(TreeNode root,StringBuilder sb)
    {
        if(root==null)
        {
            return sb;
        }
        sb.append(root.val);
        if(root.left!=null)
        {
            sb.append("(");
            tree(root.left,sb);
            sb.append(")");
        }
        if(root.right!=null)
        {
            if(root.left==null)
            {
                sb.append("()");
            }
            sb.append("(");
            tree(root.right,sb);
            sb.append(")");
        }
        return sb;
    }
}