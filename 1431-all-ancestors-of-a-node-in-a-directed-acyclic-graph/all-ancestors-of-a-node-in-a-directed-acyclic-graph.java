class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
     ArrayList<List<Integer>> graph=new ArrayList<>();
     ArrayList<List<Integer>> result=new ArrayList<>();
     Stack<Integer> st=new Stack<>();
     boolean[] visit=new boolean[n];
     for(int i=0;i<n;i++)
     {
        graph.add(new ArrayList<>());
        result.add(new ArrayList<>());
     }   
     int m=edges.length;
     for(int i=0;i<m;i++)
     {
        graph.get(edges[i][0]).add(edges[i][1]);
     }
     for(int i=0;i<n;i++)
     {
        if(!visit[i])
        dfs(graph,visit,i,st);
     }
     int[] top=new int[n];
     int l=0;
     while(!st.isEmpty())
     {
       top[l++] =st.pop();
     }
     for(int i=0;i<n;i++)
     {
        int k=top[i];
        for(int u:graph.get(k))
        {
            result.get(u).add(k);
        }
     }
     ArrayList<List<Integer>> res=new ArrayList<>();
     for(int i=0;i<n;i++)
     {
        ArrayList<Integer> arr=new ArrayList<>(result.get(top[i]));
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int u:result.get(top[i]))
        {
            for(int v:result.get(u))
            {
                if(!arr.contains(v))
                {
                arr2.add(v);
                arr.add(v);
                }
            }
        }
        result.get(top[i]).addAll(arr2);
        Collections.sort(result.get(top[i]));
     }
     return result;
    }
    public void dfs(ArrayList<List<Integer>> graph,boolean[] visit,int s,Stack<Integer> st)
    {
        visit[s]=true;
        for(int u:graph.get(s))
        {
            if(!visit[u])
            dfs(graph,visit,u,st);
        }
        st.push(s);
    }
}