class Solution {
    public int maximumStrongPairXor(int[] nums) {
     int count=0,n=nums.length;
     for(int i=0;i<n;i++)
     {
        for(int j=i;j<n;j++)
        {
            if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j]))
            {
                count =Math.max(count,nums[i]^nums[j]);
            }
        }
     } 
     return count;  
    }
}