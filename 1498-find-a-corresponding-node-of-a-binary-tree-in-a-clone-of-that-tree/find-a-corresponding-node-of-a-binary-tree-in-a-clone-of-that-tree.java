/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    getTarget(original,cloned,target);
    return temp;
    }
    TreeNode temp=null;
     public void getTarget(final TreeNode original, final TreeNode cloned, final TreeNode target) {
     if(original==null)
     {
        return;
     }   
     if(original==target)
     {
        temp=cloned;
     }
     getTarget(original.left,cloned.left,target);
     getTarget(original.right,cloned.right,target);
    }
}