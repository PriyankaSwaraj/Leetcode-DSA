class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int num:nums)
        {
           total += num;
        }
        int k=2*total+1,n=nums.length;
        int[][] dp=new int[n][k];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                dp[i][j]=Integer.MAX_VALUE;
            }
        }  
        return sum(nums,0,0,target,dp,total);
    }
    public int sum(int[] nums,int idx,int sum,int target,int[][] dp,int total) {
      if(idx==nums.length)
      {
        if(sum==target)
        return 1;
        return 0;
      }
      if(dp[idx][sum+total]!=Integer.MAX_VALUE)
      {
        return dp[idx][total+sum];
      }
    int plus = sum(nums,idx+1,sum+nums[idx],target,dp,total);
    int minus = sum(nums,idx+1,sum-nums[idx],target,dp,total);
    return dp[idx][sum+total]=plus+minus;
    }
}