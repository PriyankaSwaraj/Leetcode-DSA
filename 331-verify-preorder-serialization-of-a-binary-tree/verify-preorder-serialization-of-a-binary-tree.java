class Solution {
    class Node{
        Node left;
        Node right;
        String val;
        Node(String data){
         this.val=data;
        }
    }
    public boolean isValidSerialization(String preorder) {
    String[] str=preorder.split(",");
    tree(str);
    return index==str.length-1;
    }
    int index=-1;
    public Node tree(String[] str)
    {
        index++;
        if(index>=str.length||str[index].equals("#"))
        {
            return null;
        }
        Node newNode =new Node(str[index]);
        newNode.left=tree(str);
        newNode.right=tree(str);
        return newNode;
    }
}