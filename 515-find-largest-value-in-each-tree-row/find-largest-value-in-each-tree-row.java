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
    public List<Integer> largestValues(TreeNode root) {
    ArrayList<Integer> arr=new ArrayList<>();
    if(root==null)
    {
        return arr;
    }
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    int maxi=Integer.MIN_VALUE;
    while(!q.isEmpty())
    {
        TreeNode temp=q.remove();
        if(temp==null)
        {
            arr.add(maxi);
            if(q.isEmpty())
            {
                break;
            }
            else{
                maxi=Integer.MIN_VALUE;
                q.add(null);
            }
        }
        else{
            maxi=Math.max(maxi,temp.val);
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
    return arr;   
    }
}