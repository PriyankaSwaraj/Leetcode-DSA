class Solution {
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
    public boolean search(String s)
    {
        int n=s.length();
        Node curr=root;
        for(int i=0;i<n;i++)
        {
            int idx=s.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            if(i==n-1)
            {
                if(!curr.children[idx].eow)
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
      int n=wordDict.size();
      for(int i=0;i<n;i++)
      {
        insert(wordDict.get(i));
      } 
      
      return wordBreak2(s); 
    }
    HashMap<String,Boolean> map=new HashMap<>();
    public boolean wordBreak2(String s)
    {
        if(s.equals(""))
        {
            return true;
        }
        if(map.containsKey(s))
        {
            return map.get(s);
        }
        int n=s.length();
        for(int i=1;i<=n;i++)
        {
            String first=s.substring(0,i);
            String second=s.substring(i);
            if(search(first)&&wordBreak2(second))
            {
                return true;
            }
        }
    map.put(s,false);
        return false;
    }
}