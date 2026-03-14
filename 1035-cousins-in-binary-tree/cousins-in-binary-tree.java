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
    public boolean isCousins(TreeNode root, int x, int y) {
      Queue<TreeNode> q=new LinkedList<>();
      int depth1=1,depth2=1;
      TreeNode d1=root,d2=root;
      q.add(root);
      q.add(null);
      while(!q.isEmpty())
      {
        TreeNode temp=q.remove();
        if(temp==null)
        {
            depth1++;
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            d1=temp;
            TreeNode l=temp.left;
            TreeNode r=temp.right;
            if(l!=null)
            {
                if(l.val==x)
                {
                     depth1++;
                    break;
                }
                q.add(temp.left);
            }
            if(r!=null)
            {
                if(r.val==x)
                {
                     depth1++;
                    break;
                }
                q.add(temp.right);
            }
        }
      }
      q.clear();
      q.add(root);
      q.add(null);
      while(!q.isEmpty())
      {
        TreeNode temp=q.remove();
        if(temp==null)
        {
            depth2++;
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            d2=temp;
            TreeNode l=temp.left;
            TreeNode r=temp.right;
            if(l!=null)
            {
                if(l.val==y)
                {
                     depth2++;
                    break;
                }
                q.add(temp.left);
            }
            if(r!=null)
            {
                if(r.val==y)
                {
                     depth2++;
                    break;
                }
                q.add(temp.right);
            }
        }
      }
      return depth1==depth2&&d1!=d2;  
    }
}