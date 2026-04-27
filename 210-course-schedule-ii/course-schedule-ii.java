class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    ArrayList<List<Integer>> graph=new ArrayList<>();
    for(int i=0;i<numCourses;i++)
    {
        graph.add(new ArrayList<>());
    }    
    int n=prerequisites.length;
    for(int i=0;i<n;i++)
    {
        graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
    }
    boolean[] visit=new boolean[numCourses];
    boolean[] rec=new boolean[numCourses];
    int[] result=new int[numCourses];
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<numCourses;i++)
    {
        if(!visit[i])
        {
        if(dfs(graph,visit,i,st,rec))
          return new int[]{};
        }
    }
    int k=0;
    while(!st.isEmpty())
    {
        result[k++]=st.pop();
    }
    return result;
    }

    public boolean dfs(ArrayList<List<Integer>> graph,boolean[] visit,int s,Stack<Integer> st,boolean[] rec)
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
            if(dfs(graph,visit,u,st,rec))
            return true;
            }
        }
        rec[s]=false;
        st.push(s);
        return false;
    }
}