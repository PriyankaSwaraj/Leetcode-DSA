class Solution {
    class Pair implements Comparable<Pair>{
        int src;
        int dst;
        int wht;
        Pair(int s,int d, int w)
        {
            src=s;
            dst=d;
            wht=w;
        }
        public int compareTo(Pair other)
        {
            return this.wht-other.wht;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
     ArrayList<List<List<Integer>>> graph=new ArrayList<>();
     for(int i=0;i<=n;i++)
     {
        graph.add(new ArrayList<>());
     }
     int m=times.length;
     for(int i=0;i<m;i++)
     {
        graph.get(times[i][0]).add(Arrays.asList(times[i][1],times[i][2]));
     }
     PriorityQueue<Pair> pq=new PriorityQueue<>();
     int[] dist=new int[n+1];
     for(int i=1;i<=n;i++)
     {
        if(i!=k)
        dist[i]=Integer.MAX_VALUE;
     }
     pq.add(new Pair(k,k,0));
     boolean[] visit=new boolean[n+1];
     while(!pq.isEmpty())
     {
        Pair p=pq.poll();
        int v=p.src;
        if(!visit[v])
        {
            int s=graph.get(v).size();
            visit[v]=true;
            for(int i=0;i<s;i++)
            {
                List<Integer> arr=graph.get(v).get(i);
                int u=arr.get(0);
                int w=arr.get(1);
                if(dist[v]+w<dist[u])
                {
                    dist[u]=dist[v]+w;
                    pq.add(new Pair(u,v,dist[v]+w));
                }
            }
        }
     }
     int mini=Integer.MIN_VALUE;
     for(int i=1;i<=n;i++)
     {
       if(dist[i]==Integer.MAX_VALUE)
       return -1;
       if(i!=k)
       mini=Math.max(mini,dist[i]);
     }
     return mini;
    }
}