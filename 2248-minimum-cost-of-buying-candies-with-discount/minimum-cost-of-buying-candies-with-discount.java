class Solution {
    public int minimumCost(int[] cost) {
     Arrays.sort(cost);
     int n=cost.length,count=0;
     for(int i=n-1;i>0;i -=3)
     {
        count += cost[i]+cost[i-1];
     }
     if(n%3==1)
     {
        count += cost[0];
     }
     return count; 
    }
}