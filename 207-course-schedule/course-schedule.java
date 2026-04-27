class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    int e=prerequisites.length,v=0;
    ArrayList<List<Integer>> graph=new ArrayList<>();
    for(int i=0;i<e;i++)
    {
        v=Math.max(v,prerequisites[i][1]);
        v=Math.max(v,prerequisites[i][0]);
    }    
    v += 1;
    for(int i=0;i<v;i++)
    {
        graph.add(new ArrayList<>());
    }
    for(int i=0;i<e;i++)
    {
        graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
    }
    boolean[] visit=new boolean[v];
    boolean[] rec=new boolean[v];
    for(int i=0;i<v;i++)
    {
        if(!visit[i])
        {
            if(isCycle(graph,visit,rec,i))
            return false;
        }
    }
    return true;
    } 
    public boolean isCycle(ArrayList<List<Integer>> graph,boolean[] visit,boolean[] rec,int s)
    {
        visit[s]=true;
        rec[s]=true;
        for(int u:graph.get(s))
        {
            if(rec[u])
            {
                return true;
            }
            else if(!visit[u])
            {
                if(isCycle(graph,visit,rec,u))
                return true;
            }
        }
        rec[s]=false;
        return false;
    }
}