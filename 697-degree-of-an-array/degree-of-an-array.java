class Solution {
    public int findShortestSubArray(int[] nums) {
     int[] freq=new int[50000];
     int maxf=0,max=Integer.MAX_VALUE,n=nums.length;
     for(int num:nums)
     {
        freq[num]++;
        maxf=Math.max(maxf,freq[num]);
     }
     for(int num:nums)
     {
        if(freq[num]==maxf)
        {
          max=Math.min(max,result(nums,n,num));
        }
     }
     return max;
    }
    public int result(int[] nums,int n,int max)
    {
     int first=0,last=n-1;
     while(nums[first]!=max)
     {
        first++;
     }
     while(nums[last]!=max)
     {
        last--;
     }
     return last-first+1;
    }
}