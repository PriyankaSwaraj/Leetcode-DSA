class Solution {
    class Pair{
        int idx;
        double dist;
        Pair(int i,double d)
        {
            this.idx = i;
            this.dist=d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->Double.compare(p1.dist,p2.dist));
        int n=points.length,idx=0;
        for(int i=0;i<n;i++)
        {
            pq.add(new Pair(i,Math.sqrt(Math.pow(points[i][0],2)+Math.pow(points[i][1],2))));
        }
        int[][] result=new int[k][2];
        while(k>0)
        {
            int i=pq.poll().idx;
            result[idx++]=new int[]{points[i][0],points[i][1]};
            k--;
        }
        return result;
    }
}