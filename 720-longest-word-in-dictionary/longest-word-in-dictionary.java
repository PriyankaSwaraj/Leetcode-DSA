class Solution {
    Node root=new Node();
    class Node{
        Node[] children;
        boolean eow;
        Node(){
            children=new Node[26];
        }
    }
    String str="";
    public String longestWord(String[] words) {
    int n=words.length;
    for(int i=0;i<n;i++)
    {
        insert(words[i]);
    }
    search(root,new StringBuilder());
    return str;    
    }
    public void search(Node root,StringBuilder temp)
    {
        if(root==null)
        {
            return;
        }
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null&&root.children[i].eow)
            {
                temp.append((char)(i+'a'));
                if(temp.length()>str.length())
                {
                    str=temp.toString();
                }
                search(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public void insert(String word)
    {
        Node curr=root;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
        int idx=word.charAt(i)-'a';
        if(curr.children[idx]==null)
        {
            curr.children[idx]=new Node();
        }
        if(i==n-1)
        {
            curr.children[idx].eow=true;
        }
        curr=curr.children[idx];
        }
    }
}