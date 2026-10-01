class Solution {
    public int deleteAndEarn(int[] nums) {
     int n=nums.length,max=0;
     for(int num:nums)
     {
        max=Math.max(max,num);
     }   
     int[] freq=new int[max+1];
     int[] dp=new int[max+1];
     Arrays.fill(dp,-1);
     for(int num:nums)
     {
        freq[num]++;
     }
     return recur(0,freq,dp);
    }
    public int recur(int idx,int[] freq,int[] dp)
    {
        if(idx>=freq.length)
        {
            return 0;
        }
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        int skip=recur(idx+1,freq,dp);
        int take=recur(idx+2,freq,dp)+(freq[idx]*idx);
        return dp[idx]=Math.max(skip,take);
    }
}