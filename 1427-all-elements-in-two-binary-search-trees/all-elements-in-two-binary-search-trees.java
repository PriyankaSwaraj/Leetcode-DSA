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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
     ArrayList<Integer> arr=get(root1,root2,new ArrayList<>());  
     Collections.sort(arr);
     return arr;
    }
    public ArrayList<Integer> get(TreeNode root1,TreeNode root2,ArrayList<Integer> arr)
    {
        if(root1==null&&root2==null)
        {
            return arr;
        }
        if(root1==null)
        {
            arr.add(root2.val);
            get(root1,root2.left,arr);
            get(root1,root2.right,arr);
        }
        else if(root2==null)
        {
            arr.add(root1.val);
            get(root1.left,root2,arr);
            get(root1.right,root2,arr);
        }
        else{
            arr.add(root1.val);
            arr.add(root2.val);
            get(root1.left,root2.left,arr);
            get(root1.right,root2.right,arr);
        }
        return arr;
    }
}