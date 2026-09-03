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
    public boolean isCompleteTree(TreeNode root) {
     Queue<Pair> q=new LinkedList<>();
     q.add(new Pair(root,0));
     int sum=0,en=0;
     while(!q.isEmpty())
     {
        int n=q.size();
        for(int i=0;i<n;i++)
        {
           Pair p=q.poll();
           TreeNode curr=p.node;
           en=p.idx;
           sum += en;
           if(curr.left!=null)
           {
            q.add(new Pair(curr.left,en*2+1));
           }
           if(curr.right!=null)
           {
            q.add(new Pair(curr.right,en*2+2));
           }
        }
     }
     return sum==(en*(en+1)/2);
    }
}