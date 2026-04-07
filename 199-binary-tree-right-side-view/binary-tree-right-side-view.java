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
    public List<Integer> rightSideView(TreeNode root) {
    rightView(root,1);
    return arr;    
    }
    int maxLevel=0;
    ArrayList<Integer> arr=new ArrayList<>();
    public void rightView(TreeNode root,int level)
    {
      if(root==null)
      {
        return;
      }
      if(maxLevel<level)
      {
        arr.add(root.val);
        maxLevel=level;
      }
      rightView(root.right,level+1);
      rightView(root.left,level+1);
    }
}