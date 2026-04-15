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
    public TreeNode sortedArrayToBST(int[] nums) {
    int n=nums.length;
    return build(nums,0,n-1);
    }
    public TreeNode build(int[] nums,int low,int high)
    {
        int n=(low+high)/2;
        if(low>high)
        {
            return null;
        }
        TreeNode root=new TreeNode(nums[n]);
        root.left=build(nums,low,n-1);
        root.right=build(nums,n+1,high);
        return root;
    }
}