class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
      return Math.max(robber(nums,0,n-1),robber(nums,1,n));  
    }
    public int robber(int[] nums,int s,int n)
    {
        if(s==n-1)
        {
            return nums[s];
        }
        int[] dp=new int[n];
        dp[s]=nums[s];
        dp[s+1]=Math.max(nums[s],nums[s+1]);
        for(int i=s+2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
}