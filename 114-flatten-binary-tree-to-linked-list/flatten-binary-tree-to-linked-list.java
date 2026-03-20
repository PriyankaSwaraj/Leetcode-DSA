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
    ArrayList<Integer> arr=new ArrayList<>();
    public void flatten(TreeNode root) {
    int n= array(root);
     for(int i=1;i<n;i++)
     {
        root.right=new TreeNode(arr.get(i));
        root.left=null;
        root=root.right;
     }
    }
    public int array(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        arr.add(root.val);
        array(root.left);
        array(root.right);
        return arr.size();
    }
}