class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    int n=rooms.size();
    boolean[] visit=new boolean[n];
    dfs(rooms,visit,0);
    for(int i=1;i<n;i++)
    {
      if(!visit[i])
      return false;
    }  
    return true;
    }
    public void dfs(List<List<Integer>> graph,boolean[] visit,int s)
    {
        visit[s]=true;
        for(int u:graph.get(s))
        {
            if(!visit[u])
            dfs(graph,visit,u);
        }
    }
}