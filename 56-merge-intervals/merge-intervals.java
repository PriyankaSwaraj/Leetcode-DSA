class Solution {
    class Pair{
        int start;
        int end;
        Pair(int s,int e)
        {
            this.start=s;
            this.end=e;
        }
    }
    public int[][] merge(int[][] intervals) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->p1.start-p2.start);
        int n=intervals.length,idx=0;
        for(int i=0;i<n;i++)
        {
            pq.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        int[][] result=new int[n][2];
        Pair p=pq.poll();
        while(!pq.isEmpty())
        {
          Pair p2=pq.poll();
          if(p.end>=p2.start)
          {
            p.end=Math.max(p.end,p2.end);
          }
          else{
            result[idx][0]=p.start;
            result[idx][1]=p.end;
            p=p2;
            idx++;
          }
        }
        result[idx][0]=p.start;
        result[idx][1]=p.end;
        return Arrays.copyOf(result,idx+1);
    }
}