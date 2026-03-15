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
    public int diameterOfBinaryTree(TreeNode root) {
    return diameter2(root).diam;    
    }
   class TreeInfo{
        int height;
        int diam;
        TreeInfo(int h,int d)
        {
            this.height=h;
            this.diam=d;
        }
    }
    public TreeInfo diameter2(TreeNode root)
    {
        if(root==null)
        {
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.height,right.height)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.height+right.height;
        int mydiam=Math.max(diam1,Math.max(diam2,diam3));
        return new TreeInfo(myHeight,mydiam);
    }
}