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
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result=new ArrayList<>();
    if(root==null)
    {
        return result;
    }
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    double sum=0,len=0; 
    while(!q.isEmpty())
    {
        TreeNode temp=q.remove();
        if(temp==null)
        {
          result.add(sum/len);
          if(q.isEmpty())
          {
            break;
          }
          else{
            sum=0;
            len=0;
            q.add(null);
          }
        }
        else{
            sum += temp.val;
            len++;
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
    } 
    return result;  
    }
}