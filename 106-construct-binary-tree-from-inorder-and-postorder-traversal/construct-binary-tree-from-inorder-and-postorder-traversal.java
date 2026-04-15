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
    HashMap<Integer,Integer> map =new HashMap<>();
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    int n=postorder.length;
    for(int i=0;i<n;i++)
    {
        map.put(inorder[i],i);
    }
    postIndex=n;
    return build(postorder,0,n-1);  
    }
    public TreeNode build(int[] pos,int low,int high)
    {
        if(low>high)
        {
            return null;
        }
        TreeNode root=new TreeNode(pos[--postIndex]);
        int index=map.get(root.val);
        root.right=build(pos,index+1,high);
        root.left=build(pos,low,index-1);
        return root;
    }
}