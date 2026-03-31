class Solution {

    Node root=new Node();

    class Node{
        Node[] children;
        boolean eow;
        Node(){
            children=new Node[10];
        }
    }

    List<Integer> arr=new ArrayList<>(); 

    public List<Integer> lexicalOrder(int n) {
     for(int i=0;i<=n;i++)
     {
        insert(Integer.toString(i));
     } 

    num(root,0);
    arr.removeFirst();
    return arr;  
    }

    public void num(Node root,int nu)
    {
        if(root==null)
        {
            return;
        }
        
        for(int i=0;i<10;i++)
        {
          if(root.children[i]!=null)
          {
           nu=nu*10+i;
            if(root.children[i].eow)
            {
                arr.add(nu);
            }
            num(root.children[i],nu);
            nu /=10;
          }
        }
    }
    public void insert(String s)
    {
        Node curr=root;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int idx=s.charAt(i)-48;
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