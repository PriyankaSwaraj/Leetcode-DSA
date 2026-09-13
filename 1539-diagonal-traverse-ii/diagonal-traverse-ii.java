class Solution {
    class diagonal implements Comparable<diagonal>{
        int sum;
        int row;
        int val;
        diagonal(int s,int r,int v)
        {
            this.sum=s;
            this.row=r;
            this.val=v;
        }
        public int compareTo(diagonal other)
        {
            if(this.sum==other.sum)
            {
                return other.row-this.row;
            }
            return this.sum-other.sum;
        }
    }
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
    int m=nums.size(),len=0;
    PriorityQueue<diagonal> pq=new PriorityQueue<>(); 
    for(int i=0;i<m;i++)
    {
        int n=nums.get(i).size();
        for(int j=0;j<n;j++)
        {
            pq.add(new diagonal(i+j,i,nums.get(i).get(j)));
        }
        len += n;
    }
    int[] result=new int[len];
    len=0;
    while(!pq.isEmpty())
    {
        result[len++]=pq.poll().val;
    }
    return result;
    }
}