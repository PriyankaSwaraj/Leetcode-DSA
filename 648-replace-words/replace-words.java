class Solution {
    Node root =new Node();
    class Node{
        Node[] children;
        boolean eow;
        Node(){
            children =new Node[26];
        }
    }
    public String replaceWords(List<String> dictionary, String sentence) {
    int n=dictionary.size();
    for(int i=0;i<n;i++)
    {
        build(dictionary.get(i));
    }    
    String[] words=sentence.split(" ");
    int m=words.length;
    String s="";
    for(int i=0;i<m-1;i++)
    {
        String str=words[i];
        int k=search(str);
        if(k!=-1)
        {
            s += str.substring(0,k+1);
        }
        else{
            s += str;
        }
        s += " ";
    }
    String str=words[m-1];
    int k=search(str);
    if(k!=-1)
    {
        s += str.substring(0,k+1); 
    }
    else{
        s += str;
    }
    return s;
    }
    public void build(String word)
    {
        int n=word.length();
        Node curr=root;
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
    public int search(String word)
    {
        int n=word.length();
        Node curr=root;
        int k=-1;
        for(int i=0;i<n;i++)
        {
            k++;
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return -1;
            }
            if(curr.children[idx].eow)
            {
                return k;
            }
            curr=curr.children[idx];
        }
        return k;
    }
}