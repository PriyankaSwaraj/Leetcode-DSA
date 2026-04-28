class Solution {
    public int findCenter(int[][] edges) {
    int n=edges.length;
    ArrayList<List<Integer>> graph=new ArrayList<>();
    for(int i=0;i<=n+1;i++)
    {
        graph.add(new ArrayList<>());
    }
    for(int i=0;i<n;i++)
    {
        graph.get(edges[i][0]).add(edges[i][1]);
        graph.get(edges[i][1]).add(edges[i][0]);
    }
    for(int i=0;i<=n+1;i++)
    {
        if(graph.get(i).size()==n)
        {
           return i;
        }
    }
    return -1;    
    }
}