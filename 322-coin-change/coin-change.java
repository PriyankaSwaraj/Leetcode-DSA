class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=recur(coins,amount,dp,coins.length);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public int recur(int[] coins,int amount,int[] dp,int n)
    {
        if(amount==0)
        {
            return 0;
        }
        if(amount<0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=-1)
        {
            return dp[amount];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int val=recur(coins,amount-coins[i],dp,n);
            if(val!=Integer.MAX_VALUE)
            {
                ans=Math.min(ans,val+1);
            }
        }
        return dp[amount]=ans;
    }
}