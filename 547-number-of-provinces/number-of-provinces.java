class Solution {
    public int findCircleNum(int[][] isConnected) {
    int n=isConnected.length;
    ArrayList<List<Integer>> graph =new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        graph.add(new ArrayList<>());
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
          if(isConnected[i][j]==1&&i!=j)
          graph.get(i).add(j);
        }
    }
    int count=0;
    boolean[] visit=new boolean[n];
    for(int i=0;i<n;i++)
    {
        if(!visit[i])
        {
            count++;
            dfs(graph,visit,i);
        }
    }    
    return count;
    }
    public void dfs(ArrayList<List<Integer>> graph,boolean[] visit,int s)
    {
        visit[s]=true;
        for(int u:graph.get(s))
        {
           if(!visit[u])
           dfs(graph,visit,u); 
        }
    }
}