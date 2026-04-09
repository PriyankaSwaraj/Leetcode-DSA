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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
     TreeNode temp=removeNodes(root,target);
     if(temp.left==null&&temp.right==null&&temp.val==target)
     return null;
     return temp;
    }
    public TreeNode removeNodes(TreeNode root, int target) {
     if(root==null)
     {
        return root;
     }   
     TreeNode temp1=removeNodes(root.left,target);
     if(temp1!=null&&temp1.left==null&&temp1.right==null&&temp1.val==target)
     {
        root.left=null;
     }
     TreeNode temp2=removeNodes(root.right,target);
     if(temp2!=null&&temp2.right==null&&temp2.left==null&&temp2.val==target)
     {
        root.right=null;
     }
     return root;
    }
}