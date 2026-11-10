class Solution {
    public int climbStairs(int n, int[] costs) {
     int[] dp=new int[n];
     dp[0]=costs[0]+1;
     if(n==1)
     {
        return dp[0];
     }
     dp[1]=Math.min(costs[1]+4,dp[0]+costs[1]+1);
     if(n==2)
     {
        return dp[1];
     }
     dp[2]=Math.min(Math.min(costs[2]+9,dp[0]+costs[2]+4),dp[1]+costs[2]+1);
     for(int i=3;i<n;i++)
     {
        dp[i]=Math.min(Math.min(dp[i-1]+costs[i]+1,dp[i-2]+costs[i]+4),dp[i-3]+costs[i]+9);
     }
     return dp[n-1];
    }
}