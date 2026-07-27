class Solution {
    public int countSpecialSubsequences(int[] nums) {
     long mod=1_000_000_007L;
     long dp0=0,dp1=0,dp2=0;
     for(int num :nums)
     {
        if(num==0)
        {
            dp0=(2*dp0+1)%mod;
        }
        else if(num==1)
        {
            dp1=(2*dp1+dp0)%mod;
        }
        else{
            dp2=(2*dp2+dp1)%mod;
        }
     }   
     return (int)dp2;
    }
}