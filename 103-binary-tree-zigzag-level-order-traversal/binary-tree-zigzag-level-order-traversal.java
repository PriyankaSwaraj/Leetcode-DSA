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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     ArrayList<List<Integer>> arr=new ArrayList<>();
     if(root==null)
     {
        return arr;
     }
     Queue<TreeNode> q=new LinkedList<>();
     boolean check=true;
     ArrayList<Integer> num=new ArrayList<>();
     q.add(root);
     q.add(null);
     while(!q.isEmpty())
     {
        TreeNode temp=q.remove();
        if(temp==null)
        {
            if(check)
            {
                arr.add(new ArrayList<>(num));
                check=false;
            }
            else{
                Collections.reverse(num);
                arr.add(new ArrayList<>(num));
                check=true;
            }
            if(q.isEmpty())
            {
                break;
            }
            else{
                num.clear();
                q.add(null);
            }
        }
        else{
            num.add(temp.val);
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