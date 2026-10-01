class Solution {
    public int deleteAndEarn(int[] nums) {
     int n=nums.length,max=0;
     for(int num:nums)
     {
        max=Math.max(max,num);
     }   
     int[] freq=new int[max+1];
     int[] dp=new int[max+1];
     for(int num:nums)
     {
        freq[num]++;
     }
     if(n==1||max==1)
     {
        return nums[0]*freq[nums[0]];
     }
     dp[1]=freq[1];
     dp[2]=Math.max(freq[1],freq[2]*2);
     for(int i=3;i<=max;i++)
     {
       dp[i]=Math.max((freq[i]*i)+dp[i-2],dp[i-1]);
     }
     return dp[max];
    }
}