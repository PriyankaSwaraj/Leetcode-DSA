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
    public long kthLargestLevelSum(TreeNode root, int k) {
    Queue<TreeNode> q=new LinkedList<>();
    long sum=0;
    q.add(root);
    q.add(null);
    ArrayList<Long> num=new ArrayList<>();
    while(!q.isEmpty())
    {
        TreeNode temp=q.remove();
        if(temp==null)
        {
            num.add(sum);
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
                sum=0;
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
    int n=num.size();
    if(n<k)
    {
        return -1;
    }
    Collections.sort(num);
    return num.get(n-k);     
    }
}