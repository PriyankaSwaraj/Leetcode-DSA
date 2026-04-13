class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
     int n=nums.length;
     int[] freq=new int[101];
     boolean[] prime=new boolean[n+1];
     prime[1]=true;
     prime[0]=true;
     for(int num : nums)
     {
        freq[num]++;
     }   
     for(int i=2;i*i<=n;i++)
     {
        if(!prime[i])
        {
            for(int j=i*i;j<=n;j +=i)
            {
                prime[j]=true;
            }
        }
     }
     for(int num:nums)
     {
        int check=freq[num];
        if(!prime[check])
        return true;
     }
     return false;
    }
}