class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
     return recur(0,-1,nums,dp);    
    }
    public int recur(int idx,int pidx,int[] arr,int[][] dp)
    {
        if(idx==arr.length)
        {
            return 0;
        }
        if(dp[idx][pidx+1]!=-1)
        {
            return dp[idx][pidx+1];
        }
        int nottake=recur(idx+1,pidx,arr,dp);
        int take=0;
        if(pidx==-1||arr[idx]>arr[pidx])
        {
          take=1+recur(idx+1,idx,arr,dp);
        }
        return dp[idx][pidx+1]=Math.max(take,nottake);
    }
}