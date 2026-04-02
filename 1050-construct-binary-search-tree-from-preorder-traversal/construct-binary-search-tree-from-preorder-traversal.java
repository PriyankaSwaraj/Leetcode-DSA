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
    public TreeNode bstFromPreorder(int[] preorder) {
    TreeNode root=null;
    for(int num : preorder)
    {
        root=buildBST(root,num);
    }
    return root;
    }
    public TreeNode buildBST(TreeNode root,int val)
    {
        if(root==null)
        {
            root=new TreeNode(val);
            return root;
        }
        if(val>root.val)
        {
            root.right=buildBST(root.right,val);
        }
        else{
            root.left=buildBST(root.left,val);
        }
        return root;
    }
}