class Solution {
    public int minFallingPathSum(int[][] matrix) {
     int n=matrix.length;
     int[][] dp=new int[n][n];
     for(int i=0;i<n;i++)
     {
        dp[0][i]=matrix[0][i];
     }   
     for(int i=1;i<n;i++)
     {
        dp[i][0]=Math.min(dp[i-1][0]+matrix[i][0],dp[i-1][1]+matrix[i][0]);
        dp[i][n-1]=Math.min(dp[i-1][n-1]+matrix[i][n-1],dp[i-1][n-2]+matrix[i][n-1]);
        for(int j=1;j<n-1;j++)
        {
            int num=matrix[i][j];
            dp[i][j]=Math.min(Math.min(dp[i-1][j-1]+num,dp[i-1][j+1]+num),dp[i-1][j]+num);
        }
     }
     n -= 1;
     int min=dp[n][0];
     for(int i=1;i<=n;i++)
     {
        min=Math.min(min,dp[n][i]);
     }
     return min;
    }
}