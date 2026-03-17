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
    public int[] findMode(TreeNode root) {
     ArrayList<Integer> arr=mode(root);
     int n=Collections.max(arr);
     ArrayList<Integer> nums=new ArrayList<>();
     int count=0;
     for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
           if(entry.getValue()==n)
           {
            nums.add(entry.getKey());
            count++;
           }
        }
      int[] num=new int[count];
      for(int i=0;i<count;i++)
      {
        num[i]=nums.get(i);
      }  
     return num;
    }
    public ArrayList<Integer> mode(TreeNode root)
    {
     if(root==null)
     {
       return new ArrayList<>();
     }   
     map.put(root.val,map.getOrDefault(root.val,0)+1);
     mode(root.left);
     mode(root.right); 
     return new ArrayList<>(map.values()); 
    }
}