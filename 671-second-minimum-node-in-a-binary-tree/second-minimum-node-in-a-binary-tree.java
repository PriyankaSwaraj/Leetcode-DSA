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
    int max=Integer.MAX_VALUE,max2=Integer.MAX_VALUE,check=0;
    public int findSecondMinimumValue(TreeNode root) {
    if(root==null)
    {
        return -1;
    }
    int num=root.val; 
    if(num<max)
    {
        max2=max;
        max=num;
        check++;
    }
    else if(num<=max2&&num!=max)
    {
        max2=num;
        check++;
    }   
    findSecondMinimumValue(root.left);
    findSecondMinimumValue(root.right);
    return max==max2||check<2?-1:max2;
    }
}