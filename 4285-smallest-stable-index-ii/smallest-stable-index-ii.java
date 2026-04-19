class Solution {
    public int firstStableIndex(int[] nums, int k) {
    int n=nums.length;
    int min=nums[n-1];
    int[] mini=new int[n];
    for(int i=n-1;i>=0;i--)
    {
      min=Math.min(min,nums[i]);
      mini[i]=min;
    } 
    int max=nums[0]; 
    for(int i=0;i<n;i++)
    {
      max=Math.max(nums[i],max);
      if(max-mini[i]<=k)
      {
        return i;
      }
    }
    return -1;
    }
}