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
    public TreeNode reverseOddLevels(TreeNode root) {
     Queue<TreeNode> q=new LinkedList<>();
     q.add(root);
     boolean odd=false;
     while(!q.isEmpty())
     {
        ArrayList<TreeNode> arr=new ArrayList<>();
        int n=q.size();
        for(int i=0;i<n;i++)
        {
            TreeNode temp=q.poll();
            arr.add(temp);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
        if(odd)
        {
            int m=arr.size();
            for(int i=0,j=m-1;i<m/2;i++,j--)
            {
                int data=arr.get(i).val;
                arr.get(i).val=arr.get(j).val;
                arr.get(j).val=data;
            }
        }
        odd = !odd;
     }   
     return root;
    }
}