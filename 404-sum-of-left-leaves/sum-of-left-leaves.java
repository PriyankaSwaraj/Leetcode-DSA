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
    public int sumOfLeftLeaves(TreeNode root) {
     if(root==null)
     {
        return 0;
     }   
     int sum=0;
     Queue<TreeNode> q=new LinkedList<>();
     q.add(root);
     q.add(null);
     while(!q.isEmpty())
     {
        TreeNode temp=q.remove();
        if(temp==null)
        {
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            TreeNode l=temp.left;
            TreeNode r=temp.right;
            if(l!=null)
            {
               if(l.left==null&&l.right==null)
               {
                sum += l.val;
               }
                q.add(l);
            }
             if(r!=null)
            {
                q.add(r);
            }
        }
     }
     return sum;
    }
}