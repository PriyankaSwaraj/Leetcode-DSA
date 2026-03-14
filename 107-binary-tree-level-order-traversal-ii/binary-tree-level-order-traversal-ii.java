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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        ArrayList<Integer> num=new ArrayList<>();
        while(!queue.isEmpty())
        {
            TreeNode temp=queue.remove();
            if(temp==null)
            {
                arr.add(new ArrayList<>(num));
                if(queue.isEmpty())
                {
                    break;
                }
                else{
                queue.add(null);
                num.clear();
                }
            }
            else{
              num.add(temp.val);
                if(temp.left!=null)
                {
                    queue.add(temp.left);
                }
                if(temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }
        }
    Collections.reverse(arr);
    return arr;
    }
}