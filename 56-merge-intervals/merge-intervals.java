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
        int n=intervals.length;
        for(int i=0;i<n;i++)
        {
            pq.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        ArrayList<List<Integer>> arr=new ArrayList<>();
        Pair p=pq.poll();
        while(!pq.isEmpty())
        {
            Pair p2=pq.poll();
            if(p2.start<=p.end)
            {
                p.end=Math.max(p2.end,p.end);
            }
            else{
                arr.add(Arrays.asList(p.start,p.end));
                p=p2;
            }
        }
        n=arr.size();
        int[][] result=new int[n+1][2];
        for(int i=0;i<n;i++)
        {
            result[i][0]=arr.get(i).get(0);
            result[i][1]=arr.get(i).get(1);
        }
        result[n][0]=p.start;
        result[n][1]=p.end;
        return result;
    }
}