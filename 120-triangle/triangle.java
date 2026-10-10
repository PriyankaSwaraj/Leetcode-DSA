class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int[][] dp=new int[m][m]; 
       dp[0][0]=triangle.get(0).get(0);
       int n=2,fmin=dp[0][0];
       for(int i=1;i<m;i++)
       {
        List<Integer> curr=triangle.get(i);
        dp[i][0]=curr.get(0)+dp[i-1][0];
        dp[i][n-1]=curr.get(n-1)+dp[i-1][n-2];
        int min=Math.min(dp[i][0],dp[i][n-1]);
        for(int j=1;j<n-1;j++)
        {
           int a=curr.get(j); 
          dp[i][j]=Math.min(dp[i-1][j-1]+a,dp[i-1][j]+a);
          min=Math.min(min,dp[i][j]);
        }
        fmin=min;
        n++;
       }
       return fmin;
    }
}