class Solution {
    int n;
    ArrayList<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
     n=graph.length;
     boolean[] visit=new boolean[n]; 
     dfs(graph,visit,0,new ArrayList<>(Arrays.asList(0)));
     return result;
    }
    public void dfs(int[][] graph,boolean[] visit,int s, ArrayList<Integer> arr)
    {
        if(s==n-1)
        {
            result.add(new ArrayList<>(arr));
            return;
        }
        for(int u:graph[s])
        {
            if(!visit[u])
            {
                arr.add(u);
                visit[u]=true;
                dfs(graph,visit,u,arr);
                visit[u]=false;
                arr.remove(arr.size()-1);
            }
        }
    }
}