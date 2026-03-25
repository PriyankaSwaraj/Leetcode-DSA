class Trie {
    Node root=new Node();
    class Node{
        Node[] children;
        boolean eow;
        Node(){
            children=new Node[26];
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
            eow=false;
        }
    }
    public Trie() {
        
    }
    
    public void insert(String word) {
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
    
    public boolean search(String word) {
    Node curr=root;
    int n=word.length();
    for(int i=0;i<n;i++)
    {
        int idx=word.charAt(i)-'a';
        if(curr.children[idx]==null)
        {
            return false;
        }
        if(i==n-1&&!curr.children[idx].eow)
        {
            return false;
        }
        curr=curr.children[idx];
    }    
    return true;
    }
    
    public boolean startsWith(String prefix) {
    Node curr=root;
    int n=prefix.length();
    for(int i=0;i<n;i++)
    {
        int idx=prefix.charAt(i)-'a';
        if(curr.children[idx]==null)
        {
            return false;
        }
        curr=curr.children[idx];
    }
    return true;    
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */