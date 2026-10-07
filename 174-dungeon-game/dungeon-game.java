class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
       int m= dungeon.length,n=dungeon[0].length;
       int a=m-1,b=n-1;
       int[][] dp=new int[m][n];

       if(dungeon[a][b]<0)
       {
        dp[a][b]=dungeon[a][b]*(-1)+1;
       }
       else{
        dp[a][b]=1;
       }
      
       for(int i=m-2;i>=0;i--)
       {
        if(dungeon[i][b]<0)
        {
            dp[i][b] = dp[i+1][b]+dungeon[i][b]*(-1);
        }
        else{
            dp[i][b]=dp[i+1][b]-dungeon[i][b]<=0?1:dp[i+1][b]-dungeon[i][b];
        }
       }
      
       for(int i=n-2;i>=0;i--)
       {
        if(dungeon[a][i]<0)
        {
            dp[a][i]=dp[a][i+1]+dungeon[a][i]*(-1);
        }
        else{
            dp[a][i]=dp[a][i+1]-dungeon[a][i]<=0?1:dp[a][i+1]-dungeon[a][i];
        }
       }

       for(int i=m-2;i>=0;i--)
       {
        for(int j=n-2;j>=0;j--)
        {
            int min=Math.min(dp[i+1][j],dp[i][j+1]);
            if(dungeon[i][j]<0)
            {
                dp[i][j]=min+dungeon[i][j]*(-1);
            }
            else{
                dp[i][j]=min-dungeon[i][j]<=0?1:min-dungeon[i][j];
            }
        }
       }

       return dp[0][0];
    }
}