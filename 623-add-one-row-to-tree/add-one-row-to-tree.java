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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
    if(root==null)
    {
        return root; 
    } 
    if(depth==1)
    {
        TreeNode temp=new TreeNode(val);
        temp.left=root;
        return temp;
    }   
    Queue<TreeNode> q=new ArrayDeque<>();
    int dep=0;
    q.add(root);
    while(!q.isEmpty())
    {
        int count=q.size();
        if(dep==depth-2)
        {
            break;
        }
        dep++;
        for(int i=0;i<count;i++)
        {
          TreeNode temp=q.poll();
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
    while(!q.isEmpty())
    {
    TreeNode temp=q.poll();
    TreeNode temp1=temp.left,temp2=temp.right;
    temp.left=new TreeNode(val);
    temp.right=new TreeNode(val);
    temp.left.left=temp1;
    temp.right.right=temp2;
    }
    return root;
    }
}