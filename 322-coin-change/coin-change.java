class Solution {
    public int coinChange(int[] coins, int amount) {
       int n=coins.length;
       int[][] dp=new int[n+1][amount+1];
       for(int i=1;i<=amount;i++)
       {
        dp[n][i]=Integer.MAX_VALUE;
       } 
       for(int i=n-1;i>=0;i--)
       {
        for(int j=1;j<=amount;j++)
        {
            int take=Integer.MAX_VALUE;
            if(j>=coins[i]&&dp[i][j-coins[i]]!=Integer.MAX_VALUE)
            {
                take =1+dp[i][j-coins[i]];
            }
            int skip=dp[i+1][j];
            dp[i][j]=Math.min(skip,take);
        }
       }
       return dp[0][amount]==Integer.MAX_VALUE?-1:dp[0][amount];
    }
}