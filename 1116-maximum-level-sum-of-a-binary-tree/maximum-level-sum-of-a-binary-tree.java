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
    public int maxLevelSum(TreeNode root) {
    Queue<TreeNode> q=new LinkedList<>();
    int sum=0,maxSum=Integer.MIN_VALUE,level=1,maxlevel=1;
    q.add(root);
    q.add(null);
    while(!q.isEmpty())
    {
        TreeNode temp=q.remove();
        if(temp==null)
        {
            if(sum>maxSum)
            {
                maxlevel=level;
                maxSum=sum;
            }
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
                sum=0;
                 level++;
            }
        }
        else{
            sum += temp.val;
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
    return maxlevel;     
    }
}