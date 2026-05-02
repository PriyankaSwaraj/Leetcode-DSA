class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
     ArrayList<List<Integer>> graph=new ArrayList<>();
     boolean[] visit=new boolean[n];
     int m=edges.length;
     for(int i=0;i<n;i++)
     {
        graph.add(new ArrayList<>());
     } 
     for(int i=0;i<m;i++)
     {
        graph.get(edges[i][0]).add(edges[i][1]);
        graph.get(edges[i][1]).add(edges[i][0]);
     }
     return dfs(graph,visit,source,destination);
    }
    public boolean dfs(ArrayList<List<Integer>> graph,boolean[] visit,int src,int dst)
    {
        if(src==dst)
        {
            return true;
        }
        visit[src]=true;
        for(int u:graph.get(src))
        {
            if(!visit[u])
            {
                if(dfs(graph,visit,u,dst))
                return true;
            }
        }
        return false;
    }
}