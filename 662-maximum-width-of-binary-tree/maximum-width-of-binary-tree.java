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
    class Pair{
        TreeNode node;
        int idx;
        Pair(TreeNode n,int i)
        {
            this.node=n;
            this.idx=i;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
    Queue<Pair> q=new LinkedList<>();
    q.add(new Pair(root,0)); 
    int max=0;
    while(!q.isEmpty())
    {
        int n=q.size();
        int start=q.peek().idx,end=0;
        for(int i=0;i<n;i++)
        {
            Pair p=q.poll();
            TreeNode curr=p.node;
            int id =p.idx;
            end=id;
            if(curr.left!=null)
            {
                q.add(new Pair(curr.left,id*2+1));
            }
            if(curr.right!=null)
            {
                q.add(new Pair(curr.right,id*2+2));
            }
        }
        max=Math.max(max,end-start+1);
    }
    return max;
    }
}