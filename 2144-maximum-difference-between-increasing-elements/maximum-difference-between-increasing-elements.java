class Solution {
    public int maximumDifference(int[] nums) {
    int min=nums[0],n=nums.length,max=-1;
    for(int i=1;i<n;i++)
    {
        if(nums[i]!=min)
        max=Math.max(max,nums[i]-min);
        min=Math.min(min,nums[i]);
    }    
    return max;
    }
}