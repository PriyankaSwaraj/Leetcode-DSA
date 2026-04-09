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
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      int n=preorder.length;  
      for(int i=0;i<n;i++)
      {
        map.put(inorder[i],i);
      }
      return build(0,n-1,inorder,preorder);
    }
    int index=0;
    public TreeNode build(int si,int ei,int[] in,int[] pre)
    {
     if(si>ei)
     {
        return null;
     }
     TreeNode root=new TreeNode(pre[index++]);
     int index1=map.get(root.val);
     root.left=build(si,index1-1,in,pre);
     root.right=build(index1+1,ei,in,pre);
     return root;
    }
}