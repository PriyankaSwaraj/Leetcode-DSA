/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    ArrayList<Integer> result=new ArrayList<>();
    public List<Integer> postorder(Node root) {
     if(root==null)
     {
        return result;
     }   
     int n=root.children.size();
     for(int i=0;i<n;i++)
     {
        postorder(root.children.get(i));
     }
     result.add(root.val);
     return result;
    }
}