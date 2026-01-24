class Solution {
    public int minPairSum(int[] nums) {
     int n=nums.length,max=0;
     Arrays.sort(nums);
     for(int i=0,j=n-1;i<n/2;i++,j--)
     {
       max=Math.max(max,nums[i]+nums[j]);
     } 
     return max;  
    }
}