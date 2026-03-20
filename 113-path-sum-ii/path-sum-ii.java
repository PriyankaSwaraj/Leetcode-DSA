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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
     checkSum(root,targetSum,0,new ArrayList<>());
     return arr;   
    }
    ArrayList<List<Integer>> arr=new ArrayList<>();
    public void checkSum(TreeNode root,int targetSum,int sum,ArrayList<Integer> num)
    {
        if(root==null)
        {
            return;
        }
        num.add(root.val);
        sum += root.val;
        if(root.left==null&&root.right==null)
        {
            if(sum==targetSum)
            {
                arr.add(new ArrayList<>(num));
            }
        }
        else{
        checkSum(root.left,targetSum,sum,num);
        checkSum(root.right,targetSum,sum,num);
        }
         num.remove(num.size()-1);
        return;
    }
}