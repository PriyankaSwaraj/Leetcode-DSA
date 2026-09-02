class Solution {
    class Pair implements Comparable<Pair>{
        int row;
        int count;
        Pair(int c,int r)
        {
            this.count=c;
            this.row=r;
        }
        public int compareTo(Pair other)
        {
            if(this.count==other.count)
            {
                return this.row-other.row;
            }
            return this.count-other.count;
        }
        }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++)
        {
            int one=0;
            for(int num:mat[i])
            {
                if(num==1)
                one++;
            }
            pq.add(new Pair(one,i));
        }
        int[] result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=(pq.poll()).row;
        }
        return result;
    }
}