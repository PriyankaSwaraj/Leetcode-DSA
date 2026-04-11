/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string. 
    public String serialize(TreeNode root) {
    ArrayList<Integer> arr=serial(root,new ArrayList<>());
    return arr.toString();
    }
    public ArrayList<Integer> serial(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            arr.add(-1);
            return arr;
        }
        arr.add(root.val);
        serial(root.left,arr);
        serial(root.right,arr);
        return arr;
    }
    // Decodes your encoded data to tree.
    int index=0;
    public TreeNode deserialize(String data) {
    data=data.replace(" ","");
    data =data.substring(1,data.length()-1);
    String[] arr=data.split(",");
    return build(arr);   
    }
    int idx=-1;
    public TreeNode build(String[] data)
    {
        idx++;
        if(idx==data.length||data[idx].equals("-1"))
        {
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(data[idx]));
        root.left=build(data);
        root.right=build(data);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;