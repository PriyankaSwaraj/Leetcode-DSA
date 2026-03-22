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
    public int sumRootToLeaf(TreeNode root) {
    StringBuilder sb=new StringBuilder(); 
    sumRoot(root,sb);
    return sum;   
    }
    int sum=0;
    public void sumRoot(TreeNode root,StringBuilder str)
    {
      if(root==null)
      {
        return;
      } 
      str.append(root.val); 
      if(root.left==null&&root.right==null)
      {
        sum += Integer.parseInt(str.toString(),2);
      } 
      else{
       sumRoot(root.left,str);
      sumRoot(root.right,str);
      }
      str.deleteCharAt(str.length()-1);
      return;
    }
}