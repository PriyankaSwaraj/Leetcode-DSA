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
    public boolean isEvenOddTree(TreeNode root) {
     boolean check=true;
     Queue<TreeNode> q=new ArrayDeque<>();
     q.add(root);
     while(!q.isEmpty())
     {
        int count=q.size();
        if(check)
        {
         Queue<TreeNode> q2=new ArrayDeque<>();
         while(!q.isEmpty())
         {
            q2.offer(q.poll());
         }
         int num=q2.peek().val;
         if(num%2==0)
         return false;
         q.add(q2.poll());   
         while(!q2.isEmpty())
         {
            int num2=q2.peek().val;
            q.add(q2.poll());
            if(num2%2==0||num2<=num)
            return false;
            num=num2;
         }
        }

        else
        {
         Queue<TreeNode> q2=new ArrayDeque<>();
         while(!q.isEmpty())
         {
            q2.offer(q.poll());
         }
         int num=q2.peek().val;
         if(num%2!=0)
         return false;
         q.add(q2.poll());   
         while(!q2.isEmpty())
         {
            int num2=q2.peek().val;
            q.add(q2.poll());
            if(num2%2!=0||num2>=num)
            return false;
            num=num2;
         }
        }

        for(int i=0;i<count;i++)
        {
            TreeNode temp=q.poll();
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
        }
        check=!check;
     }  
     return true; 
    }
}