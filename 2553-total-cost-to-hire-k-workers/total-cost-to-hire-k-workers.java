class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
      PriorityQueue<Integer> start=new PriorityQueue<>();
      PriorityQueue<Integer> last=new PriorityQueue<>();
      int n=costs.length;
      long cost=0;
      int i=0,j=n-1,lim=n-candidates;
      while(i<candidates)
      {
        start.add(costs[i++]);
      }
      while(j>=lim&&i<=j)
      {
        last.add(costs[j--]);
      }
      while(k>0)
      {
        if(!start.isEmpty()&&(last.isEmpty()||start.peek()<=last.peek()))
        {
            cost += start.poll();
            if(i<=j)
            start.add(costs[i++]);
        }
        else{
            cost += last.poll();
            if(j>=i)
            {
                last.add(costs[j--]);
            }
        }
        k--;
      }
      return cost;
    }
}