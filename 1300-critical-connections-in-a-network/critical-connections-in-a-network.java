class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
      ArrayList<List<Integer>> graph=new ArrayList<>();
      ArrayList<List<Integer>> result=new ArrayList<>();
      int[] dist=new int[n];
      int[] low=new int[n];
      boolean[] visit=new boolean[n];
      for(int i=0;i<n;i++)
      {
        graph.add(new ArrayList<>());
      }  
      int m=connections.size();
      for(int i=0;i<m;i++)
      {
        graph.get(connections.get(i).get(0)).add(connections.get(i).get(1));
        graph.get(connections.get(i).get(1)).add(connections.get(i).get(0));
      }
      for(int i=0;i<n;i++)
      {
        if(!visit[i])
        tarjan(graph,result,visit,0,dist,low,i,-1);
      }
      return result;
    }
    public void tarjan(ArrayList<List<Integer>> graph,ArrayList<List<Integer>> result,boolean[] visit,int time,
                       int[] dst,int[] low,int curr,int par)
     {
        visit[curr]=true;
        dst[curr]=low[curr]=++time;
        for(int u:graph.get(curr))
        {
            if(u==par)
            {
                continue;
            }
            else if(visit[u])
            {
                low[curr]=Math.min(low[curr],dst[u]);
            }
            else{
                tarjan(graph,result,visit,time,dst,low,u,curr);
                low[curr]=Math.min(low[curr],low[u]);
                if(dst[curr]<low[u])
                {
                    result.add(Arrays.asList(curr,u));
                }
            }
        }
     }
}