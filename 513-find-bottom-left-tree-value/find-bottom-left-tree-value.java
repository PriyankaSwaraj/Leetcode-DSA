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
    public int findBottomLeftValue(TreeNode root) {   
    int l=root.val;
    Queue<TreeNode> q=new ArrayDeque<>();
    q.add(root);
    TreeNode temp=null;
    while(!q.isEmpty())
    {
       temp=q.remove();
       if(temp.right!=null)
      {
        q.add(temp.right);
      }
      if(temp.left!=null)
      {
        q.add(temp.left);
      }
    }
    return temp.val;
    }
}